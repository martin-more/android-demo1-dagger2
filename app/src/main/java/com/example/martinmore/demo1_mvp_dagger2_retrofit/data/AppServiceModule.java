package com.example.martinmore.demo1_mvp_dagger2_retrofit.data;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.model.User;

import dagger.Module;
import dagger.Provides;

@Module
public class AppServiceModule {

    @Provides
    User provideUser() {
        User user = new User();
        user.setId("1");
        user.setName("hello world peru");
        return user;
    }
}
