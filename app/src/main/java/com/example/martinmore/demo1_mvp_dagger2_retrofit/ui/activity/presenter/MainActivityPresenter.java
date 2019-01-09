package com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.presenter;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.model.User;
import com.example.martinmore.demo1_mvp_dagger2_retrofit.ui.activity.MainActivity;

public class MainActivityPresenter {
    private MainActivity mainActivity;
    private User user;

    public MainActivityPresenter(MainActivity mainActivity, User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }

    public void showUserName(){
        mainActivity.setTextView(user.getName());
    }
}
