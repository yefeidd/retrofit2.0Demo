package com.patrick.testretrofit.entity;

public class ReturnValue<T> {

    /**
     * code : 4000
     * msg : error
     * data : 手机号格式错误
     */

    private String code;
    private String msg;
    private T data;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ReturnValue{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
