package com.hs.web.service;

import com.hs.web.mapper.CarouselMapper;
import com.hs.web.mapper.SchoolLifeMapper;
import com.hs.web.model.CarouselModel;
import com.hs.web.model.SchoolLifeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user :flyxk
 * date :2017/11/5
 */
@Service
public class SchoolLifeService {

    @Autowired
    SchoolLifeMapper mapper;

    public List<SchoolLifeModel> list(){
        return mapper.get();
    }
}
