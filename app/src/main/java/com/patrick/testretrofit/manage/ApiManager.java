package com.patrick.testretrofit.manage;

import android.content.Context;

import com.patrick.testretrofit.R;
import com.patrick.testretrofit.bean.LoginResultBean;
import com.patrick.testretrofit.bean.MyOrderBean;
import com.patrick.testretrofit.bean.TestBean;
import com.patrick.testretrofit.entity.ReturnListValue;
import com.patrick.testretrofit.entity.ReturnValue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


/**
 * Created by zjs on 2016/11/3 0003.
 * email: m15267280642@163.com
 * explain: retrofit接口
 */

public class ApiManager {
    private static ApiManager mApiManager;
    private static Retrofit retrofit;
    private ApiService service;
    private static OkHttpClient okHttpClient;
    private static final int DEFAULT_TIMEOUT = 20; //超时
    private int[] certificates = {R.raw.tt};
    private String hosts[] = {"https//tt.zhengniu.net"};
    private Cache cache = null;
    private File httpCacheDirectory;
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(Constants_api.BASE_URL);

    /**
     * 获取单例
     */
    public static ApiManager getInstance() {
        if (mApiManager == null) {
            synchronized (ApiManager.class) {
                if (mApiManager == null) {
                    mApiManager = new ApiManager();
                }
            }
        }
        return mApiManager;
    }


    public ApiService creatService(Context context) {
        service = null;
        return getService(context);
    }


    /***
     * 单例 全局使用一个实例
     *
     * @return
     */
    public ApiService getService(Context context) {

//        if (httpCacheDirectory == null) {
//            httpCacheDirectory = new File(context.getCacheDir(), "zjs-cache");
//        }
//        try {
//            if (cache == null) {
//                cache = new Cache(httpCacheDirectory, 10 * 1024 * 1024);
//            }
//        } catch (Exception e) {
//            Log.e("OKHttp", "Could not create http cache", e);
//        }
//

        if (service == null) {
//            SSLSocketFactory ss = HttpsFactory.getSSLSocketFactory(context, certificates);
//            HostnameVerifier verifier = HttpsFactory.getHostnameVerifier(hosts);
//            if (Constants_api.BASE_URL.startsWith("https:")) {
//                okHttpClient = new OkHttpClient.Builder()
//                        .socketFactory(ss)
//                        .hostnameVerifier(verifier)
//                        .cookieJar(new CookieManger(context))
//                        .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
//                        .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
//                        .connectionPool(new ConnectionPool(8, 15, TimeUnit.SECONDS))
////                 这里你可以根据自己的机型设置同时连接的个数和时间，我这里8个，和每个保持时间为10s
//                        .build();
//            } else {
                okHttpClient = new OkHttpClient.Builder()
                        .cookieJar(new CookieManger(context))
                        .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                        .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                        .connectionPool(new ConnectionPool(8, 15, TimeUnit.SECONDS))
//                 这里你可以根据自己的机型设置同时连接的个数和时间，我这里8个，和每个保持时间为10s
                        .build();
//            }
            retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(Constants_api.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();

            synchronized (ApiService.class) {
                if (service == null) {
                    service = retrofit.create(ApiService.class);
                }
            }
        }
        return service;
    }


    /**
     * service接口
     */
    public interface ApiService {

        /**
         * 登陆
         *
         * @return
         */
        @FormUrlEncoded
        @POST(Constants_api.LOGIN_URL)
        Call<ReturnValue<LoginResultBean>> login(@Field("phone") String phone,
                                                 @Field("password") String password,
                                                 @Field("platform") String platform);


        /**
         * https测试
         */
        @GET(Constants_api.TEST_HTTPS)
        Call<TestBean> testHttps(@Query("action") String action);


        /**
         * 查询订单列表
         *
         * @param type
         * @param page
         * @param num
         * @return
         */
        @FormUrlEncoded
        @POST(Constants_api.QUERY_MY_ORDER)
        Call<ReturnListValue<MyOrderBean>> queryMyOrderList(@Field("type") String type,
                                                            @Field("page") String page,
                                                            @Field("num") String num);


    }


}
