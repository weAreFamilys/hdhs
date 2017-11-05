package com.hs.admin.controller;

import com.hs.admin.model.CarouselModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.CarouselService;
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
@RequestMapping("/carousel")
public class CarouselController {
    private final static Logger logger = LoggerFactory.getLogger(CarouselController.class);

    @Autowired
    private CarouselService carouselService;

    @RequestMapping("/list")
    public Result list() {
        Result result = new Result();
        List<CarouselModel> list = carouselService.carouselList();
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("total", (list == null) ? 0 : list.size());
        dataMap.put("carousels", list);
        result.setSuccess(true);
        result.setObj(dataMap);
        return result;
    }

    @RequestMapping("/add")
    public Result add(@RequestBody CarouselModel carouselModel) {
        System.out.println(carouselModel);
        Result result = new Result();
        if (StringUtils.isBlank(StringUtils.trim(carouselModel.getC_img()))) {
            result.setSuccess(false);
            result.setMsg("轮播图片不能为空");
            return result;
        }
        carouselService.addCarousel(carouselModel);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/del")
    public Result del(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String c_id = reqMap.get("c_id");
        if (StringUtils.isBlank(StringUtils.trim(c_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        carouselService.delCarousel(c_id);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody CarouselModel carouselModel) {
        Result result = new Result();
        String c_id = carouselModel.getC_id();
        if (StringUtils.isBlank(StringUtils.trim(c_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        carouselService.updateCarousel(carouselModel);
        result.setSuccess(true);
        return result;
    }


    @RequestMapping("/getById")
    public Result getById(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String c_id = reqMap.get("c_id");
        if (StringUtils.isBlank(StringUtils.trim(c_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        CarouselModel carouselModel = carouselService.getOne(c_id);
        if (carouselModel == null) {
            result.setSuccess(false);
            result.setMsg("未查到数据");
            return result;
        }
        result.setSuccess(true);
        result.setObj(carouselModel);
        return result;
    }

}
