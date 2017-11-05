package com.hs.web.controller;

import com.hs.web.model.CarouselModel;
import com.hs.web.service.CarouselService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @user :flyxk
 * date :2017/10/26
 */
@Controller
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    CarouselService carouselService;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        request.setAttribute("carouselList", carouselService.carouselList());
        return "/index";
    }
}
