package com.hs.web.model;

import java.util.Date;


public class SchoolLifeModel {

    private String s_id;
    private int s_index;
    private String s_title;
    private String s_desc;
    private String s_content;
    private int s_is_publish;
    private Date s_create_time;
    private String s_img;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public int getS_index() {
        return s_index;
    }

    public void setS_index(int s_index) {
        this.s_index = s_index;
    }

    public String getS_title() {
        return s_title;
    }

    public void setS_title(String s_title) {
        this.s_title = s_title;
    }

    public String getS_desc() {
        return s_desc;
    }

    public void setS_desc(String s_desc) {
        this.s_desc = s_desc;
    }

    public String getS_content() {
        return s_content;
    }

    public void setS_content(String s_content) {
        this.s_content = s_content;
    }

    public int getS_is_publish() {
        return s_is_publish;
    }

    public void setS_is_publish(int s_is_publish) {
        this.s_is_publish = s_is_publish;
    }

    public Date getS_create_time() {
        return s_create_time;
    }

    public void setS_create_time(Date s_create_time) {
        this.s_create_time = s_create_time;
    }

    public String getS_img() {
        return s_img;
    }

    public void setS_img(String s_img) {
        this.s_img = s_img;
    }

    @Override
    public String toString() {
        return "SchoolLifeModel{" +
                "s_id='" + s_id + '\'' +
                ", s_index=" + s_index +
                ", s_title='" + s_title + '\'' +
                ", s_desc='" + s_desc + '\'' +
                ", s_content='" + s_content + '\'' +
                ", s_is_publish=" + s_is_publish +
                ", s_create_time=" + s_create_time +
                ", s_img='" + s_img + '\'' +
                '}';
    }
}
