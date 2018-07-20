package com.viviannecristina.newretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.viviannecristina.newretrofit.utils.Path;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class CharacterDetailActivity extends AppCompatActivity {

    private CircleImageView imageDetail;
    private TextView nameDetail, heightDetail, massDetail, hairColor, skinColor, eyeColor, birthYear, genderType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail);

    imageDetail = findViewById(R.id.image_detail);
    nameDetail = findViewById(R.id.name_detail);
    heightDetail = findViewById(R.id.height_detail);
    massDetail = findViewById(R.id.mass_detail);
    hairColor = findViewById(R.id.hair_color);
    skinColor = findViewById(R.id.skin_color);
    eyeColor = findViewById(R.id.eye_color);
    birthYear = findViewById(R.id.birth_year);
    genderType = findViewById(R.id.gender_type);

    Bundle bundle = getIntent().getExtras();

    if(bundle != null) {
        Character character = (Character) bundle.get("character");

        Picasso.get().load(Path.URL_BASE + character.getImg()).into(imageDetail);
        nameDetail.setText(character.getName());
        hairColor.setText(character.getHair());
        skinColor.setText(character.getSkin());
        eyeColor.setText(character.getEye());
        genderType.setText(character.getGender());

        heightDetail.setText(String.valueOf(character.getHeight()));
        massDetail.setText(String.valueOf(character.getMass()));
        birthYear.setText(String.valueOf(character.getBirth()));

        }
    }
}
