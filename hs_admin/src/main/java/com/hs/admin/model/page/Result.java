package com.hs.admin.model.page;


public class Result implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean isSuccess = false;
    private String msg = "";
    private Object obj = null;

    public Result(){

    }
    public Result(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Result(boolean isSuccess, String msg) {
        this.isSuccess = isSuccess;
        this.msg = msg;
    }

    public Result(boolean isSuccess, String msg, Object obj) {
        this.isSuccess = isSuccess;
        this.msg = msg;
        this.obj = obj;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
