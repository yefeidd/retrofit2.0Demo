package com.patrick.testretrofit;

import android.app.Application;

/**
 * Created by zjs on 2017/1/12 0012.
 * email: m15267280642@163.com
 * explain:程序入口
 */

public class MyApplication extends Application {
    private static MyApplication instance;

    public synchronized static MyApplication getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}
