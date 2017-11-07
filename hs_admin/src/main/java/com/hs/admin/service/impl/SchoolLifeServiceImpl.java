package com.hs.admin.service.impl;

import com.hs.admin.mapper.SchoolLifeMapper;
import com.hs.admin.model.SchoolLifeModel;
import com.hs.admin.service.SchoolLifeService;
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
public class SchoolLifeServiceImpl implements SchoolLifeService {

    private final static Logger logger = LoggerFactory.getLogger(SchoolLifeServiceImpl.class);

    @Autowired
    SchoolLifeMapper schoolLifeMapper;

    @Override
    public List<SchoolLifeModel> list() {
        return schoolLifeMapper.getAll();
    }

    @Override
    public void add(SchoolLifeModel schoolLifeModel) {
        if (schoolLifeModel == null) {
            throw new NullPointerException("schoolLifeModel is null!");
        }
        schoolLifeModel.setS_id(UUIDUtil.genUUID());
        schoolLifeModel.setS_create_time(new Date());
        schoolLifeMapper.insert(schoolLifeModel);
    }

    @Override
    public void del(String s_id) {
        schoolLifeMapper.delete(s_id);
    }

    @Override
    public void update(SchoolLifeModel schoolLifeModel) {
        schoolLifeMapper.update(schoolLifeModel);
    }

    @Override
    public SchoolLifeModel getOne(String s_id) {
        return schoolLifeMapper.getOne(s_id);
    }
}
