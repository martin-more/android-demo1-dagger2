package com.example.martinmore.demo1_mvp_dagger2_retrofit;

import javax.inject.Singleton;

import android.app.Application;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }
}
