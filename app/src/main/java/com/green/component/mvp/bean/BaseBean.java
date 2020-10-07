package com.green.component.mvp.bean;

public class BaseBean {
    private  int code;
    private  boolean flag;
    private String msg;

    public BaseBean() {
    }

    public BaseBean(int code, boolean flag, String msg) {
        this.code = code;
        this.flag = flag;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "code=" + code +
                ", flag=" + flag +
                ", msg='" + msg + '\'' +
                '}';
    }
}
