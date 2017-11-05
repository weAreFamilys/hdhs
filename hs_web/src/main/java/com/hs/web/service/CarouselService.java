package com.hs.web.service;

import com.hs.web.mapper.CarouselMapper;
import com.hs.web.model.CarouselModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user :flyxk
 * date :2017/11/5
 */
@Service
public class CarouselService {

    @Autowired
    CarouselMapper carouselMapper;

    public List<CarouselModel> carouselList(){
        return carouselMapper.getAll();
    }
}
