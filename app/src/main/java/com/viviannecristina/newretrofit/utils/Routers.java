package com.viviannecristina.newretrofit.utils;

import com.viviannecristina.newretrofit.model.Character;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Routers {

    @GET(Path.URL_START)
    Call<List<Character>> getCharacters();
}
