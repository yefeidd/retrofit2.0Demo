package com.patrick.testretrofit.bean;

/**
 * Created by zjs on 2017/1/16 0016.
 * email: m15267280642@163.com
 * explain:
 */

public class TestBean {

    /**
     * action : advance
     * data : {"hello":"Hello Kitty !","says":"This is say !"}
     * status : init
     */

    private String action;
    private DataBean data;
    private String status;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * hello : Hello Kitty !
         * says : This is say !
         */

        private String hello;
        private String says;

        public String getHello() {
            return hello;
        }

        public void setHello(String hello) {
            this.hello = hello;
        }

        public String getSays() {
            return says;
        }

        public void setSays(String says) {
            this.says = says;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "hello='" + hello + '\'' +
                    ", says='" + says + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "action='" + action + '\'' +
                ", data=" + data +
                ", status='" + status + '\'' +
                '}';
    }
}
