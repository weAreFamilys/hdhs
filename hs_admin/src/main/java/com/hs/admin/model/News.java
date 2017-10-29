package com.hs.admin.model;

import java.util.Date;

/**
 * @user :flyxk
 * date :2017/10/29
 */
public class News {
    private String newsId;
    private String title;
    private String content;
    private int type; //文章类型
    private Date createTime;
    private int publish; //是否已发布
    private int del; //是否已删除
    private String userId;
    private String brief_intro; //文章简介
    private String img;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBrief_intro() {
        return brief_intro;
    }

    public void setBrief_intro(String brief_intro) {
        this.brief_intro = brief_intro;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId='" + newsId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", createTime=" + createTime +
                ", publish=" + publish +
                ", del=" + del +
                ", userId='" + userId + '\'' +
                ", brief_intro='" + brief_intro + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
