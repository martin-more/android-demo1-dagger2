package com.example.martinmore.demo1_mvp_dagger2_retrofit.data.api;

import com.example.martinmore.demo1_mvp_dagger2_retrofit.model.User;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/users")
    public void getUsers(Callback<List<User>> callback);
}
