package com.patrick.testretrofit.entity;

/**
 * 返回数据
 *
 * Created by Jolly on 2016/3/21 0021.
 */
public class ReturnData<T> {
    private String message;
    private T data;

    public String getMessage() {
        return message;
    }

    public ReturnData setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ReturnData setData(T data) {
        this.data = data;
        return this;
    }
}
