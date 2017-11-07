package com.hs.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.admin.constants.Page;
import com.hs.admin.model.SchoolLifeModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.SchoolLifeService;
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
@RequestMapping("/schoolLife")
public class SchoolLifeController {
    private final static Logger logger = LoggerFactory.getLogger(SchoolLifeController.class);

    @Autowired
    private SchoolLifeService schoolLifeService;

    @RequestMapping("/list")
    public Result list(@RequestBody Map<String, Integer> reqMap) {
        int pageNum = reqMap.get("pageNum") == null ? Page.PAGE_NUM : reqMap.get("pageNum");
        int pageSize = reqMap.get("pageSize") == null ? Page.PAGE_SIZE : reqMap.get("pageSize");

        Result result = new Result();

        PageHelper.startPage(pageNum, pageSize);
        List<SchoolLifeModel> list = schoolLifeService.list();

        PageInfo<SchoolLifeModel> pageInfo = new PageInfo<SchoolLifeModel>(list);

        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("page", pageInfo);
        result.setSuccess(true);
        result.setObj(dataMap);
        return result;
    }

    @RequestMapping("/add")
    public Result add(@RequestBody SchoolLifeModel schoolLifeModel) {
        Result result = new Result();
        if (StringUtils.isBlank(StringUtils.trim(schoolLifeModel.getS_img()))) {
            result.setSuccess(false);
            result.setMsg("图片不能为空");
            return result;
        }
        schoolLifeService.add(schoolLifeModel);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/del")
    public Result del(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String s_id = reqMap.get("s_id");
        if (StringUtils.isBlank(StringUtils.trim(s_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        schoolLifeService.del(s_id);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody SchoolLifeModel schoolLifeModel) {
        Result result = new Result();
        String s_id = schoolLifeModel.getS_id();
        if (StringUtils.isBlank(StringUtils.trim(s_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        schoolLifeService.update(schoolLifeModel);
        result.setSuccess(true);
        return result;
    }


    @RequestMapping("/getById")
    public Result getById(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String s_id = reqMap.get("s_id");
        if (StringUtils.isBlank(StringUtils.trim(s_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        SchoolLifeModel schoolLifeModel = schoolLifeService.getOne(s_id);
        if (schoolLifeModel == null) {
            result.setSuccess(false);
            result.setMsg("未查到数据");
            return result;
        }
        result.setSuccess(true);
        result.setObj(schoolLifeModel);
        return result;
    }

}
