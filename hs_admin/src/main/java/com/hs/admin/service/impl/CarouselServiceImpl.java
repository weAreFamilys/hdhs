package com.hs.admin.service.impl;

import com.hs.admin.mapper.CarouselMapper;
import com.hs.admin.model.CarouselModel;
import com.hs.admin.service.CarouselService;
import com.hs.admin.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    @Override
    public void addCarousel(CarouselModel carouselModel) {
        if (carouselModel == null) {
            throw new NullPointerException("carouselModel is null!");
        }
        carouselModel.setC_id(UUIDUtil.genUUID());
        carouselModel.setC_create_time(new Date());
        carouselMapper.insert(carouselModel);
    }

    @Override
    public void delCarousel(String c_id) {
        carouselMapper.delete(c_id);
    }

    @Override
    public void updateCarousel(CarouselModel carouselModel) {
        carouselMapper.update(carouselModel);
    }

    @Override
    public CarouselModel getOne(String c_id) {
        return carouselMapper.getOne(c_id);
    }
}
