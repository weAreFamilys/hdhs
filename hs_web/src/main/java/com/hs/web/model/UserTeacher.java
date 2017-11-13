package com.hs.web.model;

import java.util.Date;

/**
 * @user :flyxk
 * date :2017/11/12
 */
public class UserTeacher {
    private String id;
    private String name;
    private String pwd;
    private String account;
    private String idcard_no;
    private Date create_time;
    private int type;
    private int is_auth;
    private int is_del;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIdcard_no() {
        return idcard_no;
    }

    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIs_auth() {
        return is_auth;
    }

    public void setIs_auth(int is_auth) {
        this.is_auth = is_auth;
    }

    public int getIs_del() {
        return is_del;
    }

    public void setIs_del(int is_del) {
        this.is_del = is_del;
    }

    @Override
    public String toString() {
        return "UserTeacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", account='" + account + '\'' +
                ", idcard_no='" + idcard_no + '\'' +
                ", create_time=" + create_time +
                ", type=" + type +
                ", is_auth=" + is_auth +
                ", is_del=" + is_del +
                '}';
    }
}
