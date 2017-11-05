package com.hs.admin.service.impl;

import com.hs.admin.mapper.CarouselMapper;
import com.hs.admin.model.CarouselModel;
import com.hs.admin.service.CarouselService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user :flyxk
 * date :2017/10/28
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    private final static Logger logger = LoggerFactory.getLogger(CarouselServiceImpl.class);

    @Autowired
    CarouselMapper carouselMapper;

    @Override
    public List<CarouselModel> carouselList() {
        return carouselMapper.getAll();
    }
}
