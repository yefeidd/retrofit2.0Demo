package com.patrick.testretrofit;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.patrick.testretrofit.manage.CookieManger;
import com.patrick.testretrofit.manage.PersistentCookieStore;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.HttpUrl;

/**
 * Created by zjs on 2017/1/19 0019.
 * email: m15267280642@163.com
 * explain:
 */

public class MyWebViewActivity extends AppCompatActivity {
    private String url = "http://tt.zhengniu.net/index/guess.html";
    private WebView mWvTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiyt_my_webview);
        mWvTest = (WebView) findViewById(R.id.wv_test);

        //初始化webview的图片加载
        intWebViewImageLoader();
        mWvTest.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWvTest.getSettings().setJavaScriptEnabled(true);
        mWvTest.getSettings().setDatabaseEnabled(true);
        mWvTest.getSettings().setDomStorageEnabled(true);
        // 设置cookie
        syncCookie(url);
        mWvTest.loadUrl(url);
    }


    /**
     * 为webview设置sessionId
     *
     * @param url
     */
    private void syncCookie(String url) {
        PersistentCookieStore cookieStore = new PersistentCookieStore(this);
        List<Cookie> cookies = cookieStore.get(HttpUrl.parse("http://tt.zhengniu.net"));
        try {
            CookieSyncManager.createInstance(mWvTest.getContext());
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.removeSessionCookie();// 移除
            cookieManager.removeAllCookie();
            String cookieValue = CookieManger.formatCookie(cookies);
            cookieManager.setCookie(url, cookieValue);
            CookieSyncManager.getInstance().sync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化webView的图片加载机制
     */
    public void intWebViewImageLoader() {
        if (Build.VERSION.SDK_INT >= 19) {
            mWvTest.getSettings().setLoadsImagesAutomatically(true);
        } else {
            mWvTest.getSettings().setLoadsImagesAutomatically(false);
        }
    }
}
