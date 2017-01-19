package com.patrick.testretrofit;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.patrick.testretrofit.bean.LoginResultBean;
import com.patrick.testretrofit.entity.ReturnValue;
import com.patrick.testretrofit.manage.ApiManager;

import org.junit.Test;
import org.junit.runner.RunWith;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private static final String TAG = "ExampleInstrumentedTest";

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        ApiManager manager = ApiManager.getInstance();
//        manager.creatService(appContext).testHttps("advance").enqueue(new Callback<TestBean>() {
//            @Override
//            public void onResponse(Call<TestBean> call, Response<TestBean> response) {
//                Log.i(TAG, "onResponse:" + response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<TestBean> call, Throwable t) {
//                Log.e(TAG, "onFailure: " + t);
//            }
//        });

//        assertEquals("com.patrick.testretrofit", appContext.getPackageName());
        manager.creatService(appContext).login("15267280642", "123456", "2").enqueue(new Callback<ReturnValue<LoginResultBean>>() {
            @Override
            public void onResponse(Call<ReturnValue<LoginResultBean>> call, Response<ReturnValue<LoginResultBean>> response) {
                Log.i(TAG, "onResponse: " + response.body().toString());
            }

            @Override
            public void onFailure(Call<ReturnValue<LoginResultBean>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t);
            }
        });
    }
}
