package com.hs.admin.service;

import com.hs.admin.model.CourseModel;

import java.util.List;

public interface CourseService {

    List<CourseModel> list();

    void add(CourseModel courseModel);

    void del(String id);

    void update(CourseModel courseModel);

    CourseModel getOne(CourseModel courseModel);
}
