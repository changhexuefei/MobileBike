package com.example.gao.mobilebike.app;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;


/**
 * Created by gao on 2017/1/28.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }

}
