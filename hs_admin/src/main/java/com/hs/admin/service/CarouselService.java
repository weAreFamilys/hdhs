package com.hs.admin.service;

import com.hs.admin.model.CarouselModel;

import java.util.List;

public interface CarouselService {

    List<CarouselModel> carouselList();

    void addCarousel(CarouselModel carouselModel);

    void delCarousel(String c_id);

    void updateCarousel(CarouselModel carouselModel);

    CarouselModel getOne(String c_id);

}
