package com.hs.admin.service;

import com.hs.admin.model.SchoolLifeModel;

import java.util.List;

public interface SchoolLifeService {

    List<SchoolLifeModel> list();

    void add(SchoolLifeModel schoolLife);

    void del(String s_id);

    void update(SchoolLifeModel schoolLifeModel);

    SchoolLifeModel getOne(String s_id);

}
