package com.hs.admin.service.impl;

import com.hs.admin.mapper.CourseMapper;
import com.hs.admin.model.CourseModel;
import com.hs.admin.service.CourseService;
import com.hs.admin.util.UUIDUtil;
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
public class CourseServiceImpl implements CourseService {

    private final static Logger logger = LoggerFactory.getLogger(CourseServiceImpl.class);

    @Autowired
    private CourseMapper mapper;


    @Override
    public List<CourseModel> list() {
        return mapper.getAll();
    }

    @Override
    public void add(CourseModel courseModel) {
        if (courseModel == null) {
            throw new NullPointerException("courseModel is null!");
        }
        courseModel.setId(UUIDUtil.genUUID());
        mapper.insert(courseModel);
    }

    @Override
    public void del(String id) {
        mapper.delete(id);
    }

    @Override
    public void update(CourseModel courseModel) {
        mapper.update(courseModel);
    }

    @Override
    public CourseModel getOne(CourseModel courseModel) {
        return mapper.getOne(courseModel);
    }
}
