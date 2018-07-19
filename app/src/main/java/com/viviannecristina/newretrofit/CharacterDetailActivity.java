package com.viviannecristina.newretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.viviannecristina.newretrofit.utils.Path;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class CharacterDetailActivity extends AppCompatActivity {

    private CircleImageView imageDetail;
    private TextView name, height, mass, hair, skin, eye, birth, gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail);

    imageDetail = findViewById(R.id.image_detail);
    name = findViewById(R.id.name);
    height = findViewById(R.id.height);
    mass = findViewById(R.id.mass);
    hair = findViewById(R.id.hair_color);
    skin = findViewById(R.id.skin_color);
    eye = findViewById(R.id.eye_color);
    birth = findViewById(R.id.birth_year);
    gender = findViewById(R.id.gender);

    Bundle bundle = getIntent().getExtras();

    if(bundle != null) {
        Character character = (Character) bundle.get("character");

        Picasso.get().load(Path.URL_BASE + character.getImg()).into(imageDetail);
        name.setText(character.getName());
        hair.setText(character.getHair());
        skin.setText(character.getSkin());
        eye.setText(character.getEye());
        gender.setText(character.getGender());

        height.setText(String.valueOf(character.getHeight()));
        mass.setText(String.valueOf(character.getMass()));
        birth.setText(String.valueOf(character.getBirth()));

        }
    }
}
