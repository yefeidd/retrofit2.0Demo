package com.patrick.testretrofit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.patrick.testretrofit.bean.LoginResultBean;
import com.patrick.testretrofit.bean.MyOrderBean;
import com.patrick.testretrofit.entity.ReturnListValue;
import com.patrick.testretrofit.entity.ReturnValue;
import com.patrick.testretrofit.manage.ApiManager;
import com.patrick.testretrofit.manage.PersistentCookieStore;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private static final String COOKIE_PREFS = "Cookies_Prefs";
    private SharedPreferences cookiePrefs;
    private Button mBtnTest;
    private ApiManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTest = (Button) findViewById(R.id.btn_test);
        mBtnTest.setOnClickListener(this);
        cookiePrefs = getSharedPreferences(COOKIE_PREFS, 0);
        initView();
    }


    public void initView() {
        manager = ApiManager.getInstance();
        manager.creatService(this).login("15267280642", "123456", "2").enqueue(new Callback<ReturnValue<LoginResultBean>>() {
            @Override
            public void onResponse(Call<ReturnValue<LoginResultBean>> call, Response<ReturnValue<LoginResultBean>> response) {
                Log.i(TAG, "onResponse: " + response.body().toString());
            }

            @Override
            public void onFailure(Call<ReturnValue<LoginResultBean>> call, Throwable t) {
            }
        });

//        manager.creatService(this).testHttps("advance").enqueue(new Callback<TestBean>() {
//            @Override
//            public void onResponse(Call<TestBean> call, Response<TestBean> response) {
//                Log.i(TAG, "onResponse: " + response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<TestBean> call, Throwable t) {
//                Log.i(TAG, "onFailure: " + t);
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        qureyOrderList();
        startActivity(new Intent(this, MyWebViewActivity.class));
    }

    private void qureyOrderList() {

        PersistentCookieStore cookieStore = new PersistentCookieStore(this);
        List<Cookie> cookies = cookieStore.get(HttpUrl.parse("http://tt.zhengniu.net"));

        Log.i(TAG, "qureyOrderList: " + cookies);
        manager.getService(this).queryMyOrderList("1", "0", "10").enqueue(new Callback<ReturnListValue<MyOrderBean>>() {
            @Override
            public void onResponse(Call<ReturnListValue<MyOrderBean>> call, Response<ReturnListValue<MyOrderBean>> response) {
                Log.i(TAG, "onResponse: " + response.body().toString());
            }

            @Override
            public void onFailure(Call<ReturnListValue<MyOrderBean>> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t);
            }
        });
    }
}
