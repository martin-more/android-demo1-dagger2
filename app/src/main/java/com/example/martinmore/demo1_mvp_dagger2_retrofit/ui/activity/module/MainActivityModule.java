package com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.module;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.model.User;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.ActivityScope;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.MainActivity;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.presenter.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivityPresenter provideMainActivityPresenter(MainActivity mainActivity, User user) {
        return new MainActivityPresenter(mainActivity, user);
    }
}
