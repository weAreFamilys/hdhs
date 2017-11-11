package com.hs.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.admin.constants.Page;
import com.hs.admin.model.CourseModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.CourseService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @user :flyxk
 * date :2017/10/29
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    private final static Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    @RequestMapping("/list")
    public Result list(@RequestBody Map<String, Integer> reqMap) {
        int pageNum = reqMap.get("pageNum") == null ? Page.PAGE_NUM : reqMap.get("pageNum");
        int pageSize = reqMap.get("pageSize") == null ? Page.PAGE_SIZE : reqMap.get("pageSize");

        Result result = new Result();

        PageHelper.startPage(pageNum, pageSize);
        List<CourseModel> list = courseService.list();

        PageInfo<CourseModel> pageInfo = new PageInfo<CourseModel>(list);

        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("page", pageInfo);
        result.setSuccess(true);
        result.setObj(dataMap);
        return result;
    }

    @RequestMapping("/add")
    public Result add(@RequestBody CourseModel courseModel) {
        Result result = new Result();
        String course_name = StringUtils.trim(courseModel.getCourse_name());
        if (StringUtils.isBlank(course_name)) {
            result.setSuccess(false);
            result.setMsg("学科名称获取失败");
            return result;
        }
        courseModel.setCourse_name(course_name);
        CourseModel resModel = courseService.getOne(courseModel);
        if (resModel != null) {
            result.setSuccess(false);
            result.setMsg("已存在学科,不允许重复增加");
            return result;
        }
        courseService.add(courseModel);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/del")
    public Result del(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String id = reqMap.get("id");
        if (StringUtils.isBlank(StringUtils.trim(id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        courseService.del(id);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody CourseModel courseModel) {
        Result result = new Result();
        String id = courseModel.getId();
        if (StringUtils.isBlank(StringUtils.trim(id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        courseService.update(courseModel);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/getById")
    public Result getById(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String id = reqMap.get("id");
        if (StringUtils.isBlank(StringUtils.trim(id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        CourseModel reqModel = new CourseModel();
        reqModel.setId(id);
        CourseModel courseModel = courseService.getOne(reqModel);
        if (courseModel == null) {
            result.setSuccess(false);
            result.setMsg("未查到数据");
            return result;
        }
        result.setSuccess(true);
        result.setObj(courseModel);
        return result;
    }
}
