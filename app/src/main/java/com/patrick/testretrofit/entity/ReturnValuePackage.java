package com.patrick.testretrofit.entity;

public class ReturnValuePackage<T> {
    private ReturnValue<T> jsondata;

    public ReturnValue<T> getJsondata() {
        return jsondata;
    }

    public void setJsondata(ReturnValue<T> jsondata) {
        this.jsondata = jsondata;
    }
}
