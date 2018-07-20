package com.viviannecristina.newretrofit;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.Toast;

import com.viviannecristina.newretrofit.model.Character;
import com.viviannecristina.newretrofit.utils.RetrofitConfig;
import com.viviannecristina.newretrofit.utils.Routers;

import java.util.List;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRetrofit();
    }

    private void initRetrofit() {

        Routers routers = RetrofitConfig.retrofit.create(Routers.class);

        Call<List<Character>> characters = routers.getCaracters();

        characters.enqueue(new Call.Callback<List<Character>>(){
            @Override
            public void onResponse(@NonNull retrofit2.Call<List<Character>> call, @NonNull Response<List<Character>> response) {

            }

            @Override
            public void onFailure(@NonNull retrofit2.Call<List<Character>> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }


        });
    }
}
