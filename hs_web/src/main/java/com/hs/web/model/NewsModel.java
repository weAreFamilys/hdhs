package com.hs.web.model;

import java.util.Date;

/**
 * @user :flyxk
 * date :2017/10/29
 */
public class NewsModel {

    private String n_id;
    private String n_title;
    private String n_content;
    private int n_type; //文章类型
    private Date n_create_time;
    private int n_is_publish; //是否已发布
    private int n_is_delete; //是否已删除
    private String n_user_id;
    private String n_brief_intro; //文章简介
    private String n_img;
    private int n_index;
    private String n_desc;

    public String getN_desc() {
        return n_desc;
    }

    public void setN_desc(String n_desc) {
        this.n_desc = n_desc;
    }

    public int getN_index() {
        return n_index;
    }

    public void setN_index(int n_index) {
        this.n_index = n_index;
    }

    public String getN_id() {
        return n_id;
    }

    public void setN_id(String n_id) {
        this.n_id = n_id;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public int getN_type() {
        return n_type;
    }

    public void setN_type(int n_type) {
        this.n_type = n_type;
    }

    public Date getN_create_time() {
        return n_create_time;
    }

    public void setN_create_time(Date n_create_time) {
        this.n_create_time = n_create_time;
    }

    public int getN_is_publish() {
        return n_is_publish;
    }

    public void setN_is_publish(int n_is_publish) {
        this.n_is_publish = n_is_publish;
    }

    public int getN_is_delete() {
        return n_is_delete;
    }

    public void setN_is_delete(int n_is_delete) {
        this.n_is_delete = n_is_delete;
    }

    public String getN_user_id() {
        return n_user_id;
    }

    public void setN_user_id(String n_user_id) {
        this.n_user_id = n_user_id;
    }

    public String getN_brief_intro() {
        return n_brief_intro;
    }

    public void setN_brief_intro(String n_brief_intro) {
        this.n_brief_intro = n_brief_intro;
    }

    public String getN_img() {
        return n_img;
    }

    public void setN_img(String n_img) {
        this.n_img = n_img;
    }

    @Override
    public String toString() {
        return "NewsModel{" +
                "n_id='" + n_id + '\'' +
                ", n_title='" + n_title + '\'' +
                ", n_content='" + n_content + '\'' +
                ", n_type=" + n_type +
                ", n_create_time=" + n_create_time +
                ", n_is_publish=" + n_is_publish +
                ", n_is_delete=" + n_is_delete +
                ", n_user_id='" + n_user_id + '\'' +
                ", n_brief_intro='" + n_brief_intro + '\'' +
                ", n_img='" + n_img + '\'' +
                ", n_index=" + n_index +
                ", n_desc='" + n_desc + '\'' +
                '}';
    }
}
