package com.patrick.testretrofit.entity;

import java.util.List;

public class ReturnListValue<T> {
    /**
     * code : 4000
     * msg : error
     * data : 手机号格式错误
     */

    private String code;
    private String msg;
    private List<T> data;



    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public List<T> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ReturnListValue{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
