package com.patrick.testretrofit.bean;

/**
 * Created by zjs
 */

public class LoginResultBean extends MessageBean {
    private int is_teacher;

    public int getIs_teacher() {
        return is_teacher;
    }

    public void setIs_teacher(int is_teacher) {
        this.is_teacher = is_teacher;
    }

    @Override
    public String toString() {
        return "LoginResultBean{" +
                "is_teacher=" + is_teacher +
                '}';
    }
}
