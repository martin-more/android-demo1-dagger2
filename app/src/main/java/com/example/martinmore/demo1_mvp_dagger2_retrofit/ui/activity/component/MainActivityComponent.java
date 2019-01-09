package com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.component;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.AppComponent;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.ActivityScope;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.MainActivity;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.module.MainActivityModule;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.presenter.MainActivityPresenter;

import dagger.Component;

@ActivityScope
@Component(modules = MainActivityModule.class,dependencies = AppComponent.class)
public interface MainActivityComponent {
    MainActivity inject(MainActivity mainActivity);

    MainActivityPresenter presenter();


}
