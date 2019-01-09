package com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.AppApplication;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.AppComponent;


public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(AppApplication.get(this).getAppComponent());
    }

    protected abstract  void setupActivityComponent(AppComponent appComponent);
}
