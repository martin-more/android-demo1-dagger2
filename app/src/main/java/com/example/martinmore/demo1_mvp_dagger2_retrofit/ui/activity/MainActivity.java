package com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.AppComponent;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.R;
//import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.component.DaggerMainActivityComponent;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.component.DaggerMainActivityComponent;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.module.MainActivityModule;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.presenter.MainActivityPresenter;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv)
    TextView textView;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter.showUserName();
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainActivityComponent.builder()
                .appComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build()
                .inject(this);
    }

    public void setTextView(String username){
        textView.setText(username);
    }
}
