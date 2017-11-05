package com.hs.web.model;

import java.util.Date;

/**
 * @user :flyxk
 * date :2017/11/4
 */
public class CarouselModel {
    private String c_id;
    private int c_index;
    private String c_title;
    private String c_desc;
    private int c_has_content;
    private String c_content;
    private int c_is_publish;
    private Date c_create_time;
    private String c_img;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public int getC_index() {
        return c_index;
    }

    public void setC_index(int c_index) {
        this.c_index = c_index;
    }

    public String getC_title() {
        return c_title;
    }

    public void setC_title(String c_title) {
        this.c_title = c_title;
    }

    public String getC_desc() {
        return c_desc;
    }

    public void setC_desc(String c_desc) {
        this.c_desc = c_desc;
    }

    public int getC_has_content() {
        return c_has_content;
    }

    public void setC_has_content(int c_has_content) {
        this.c_has_content = c_has_content;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public int getC_is_publish() {
        return c_is_publish;
    }

    public void setC_is_publish(int c_is_publish) {
        this.c_is_publish = c_is_publish;
    }

    public Date getC_create_time() {
        return c_create_time;
    }

    public void setC_create_time(Date c_create_time) {
        this.c_create_time = c_create_time;
    }

    public String getC_img() {
        return c_img;
    }

    public void setC_img(String c_img) {
        this.c_img = c_img;
    }

    @Override
    public String toString() {
        return "CarouselModel{" +
                "c_id='" + c_id + '\'' +
                ", c_index=" + c_index +
                ", c_title='" + c_title + '\'' +
                ", c_desc='" + c_desc + '\'' +
                ", c_has_content=" + c_has_content +
                ", c_content='" + c_content + '\'' +
                ", c_is_publish='" + c_is_publish + '\'' +
                ", c_create_time=" + c_create_time +
                ", c_img='" + c_img + '\'' +
                '}';
    }
}
