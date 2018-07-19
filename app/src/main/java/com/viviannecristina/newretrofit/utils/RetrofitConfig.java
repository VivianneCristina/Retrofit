package com.viviannecristina.newretrofit.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface RetrofitConfig {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Path.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
