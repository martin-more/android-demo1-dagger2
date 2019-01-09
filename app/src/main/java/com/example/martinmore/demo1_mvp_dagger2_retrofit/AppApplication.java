package com.example.martinmore.demo1_mvp_dagger2_retrofit;

import android.app.Application;
import android.content.Context;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.data.AppServiceModule;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.data.api.ApiServiceModule;


public class AppApplication extends Application {

    private AppComponent appComponent;

    public static AppApplication get(Context context) {
        return (AppApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .appServiceModule(new AppServiceModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
