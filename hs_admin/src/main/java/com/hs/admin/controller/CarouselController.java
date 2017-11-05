package com.hs.admin.controller;

import com.hs.admin.model.CarouselModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.CarouselService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
        Map<String, Object> dataMap = new HashMap<String,Object>();
        dataMap.put("total", (list == null) ? 0 : list.size());
        dataMap.put("carousels", list);
        result.setSuccess(true);
        result.setObj(dataMap);
        return result;
    }

}
