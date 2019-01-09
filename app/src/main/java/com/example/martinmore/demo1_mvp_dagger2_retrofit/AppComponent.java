package com.example.martinmore.demo1_mvp_dagger2_retrofit;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.data.AppServiceModule;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.data.api.ApiService;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.data.api.ApiServiceModule;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.model.User;

import javax.inject.Singleton;

import android.app.Application;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ApiServiceModule.class, AppServiceModule.class})
public interface AppComponent {

    Application getApplication();
    ApiService getService();
    User getUser();
}
