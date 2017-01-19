package com.patrick.testretrofit.entity;

/**
 * Created by Jolly on 2016/8/3 0003.
 */
public class RetValue<T> {
    private int retCode;
    private String retMsg;
    private T data;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
