package com.hs.admin.model.page;


public class Result implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public Result (boolean isSuccess) {
		this.success = isSuccess;
	}

	public Result (boolean isSuccess, String msg) {
		this.success = isSuccess;
		this.msg = msg;
	}

	public Result (boolean isSuccess, String msg, Object obj) {
		this.success = isSuccess;
		this.msg = msg;
		this.obj = obj;
	}

	private boolean success = false;
	private String msg = "";
	private Object obj = null;

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

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "Result{" +
				"success=" + success +
				", msg='" + msg + '\'' +
				", obj=" + obj +
				'}';
	}
}
