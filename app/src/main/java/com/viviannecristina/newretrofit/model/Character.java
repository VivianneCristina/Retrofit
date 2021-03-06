package com.viviannecristina.newretrofit.model;

import java.io.Serializable;


public class Character implements Serializable {

    private String name;
    private String height;
    private String mass;
    private String hair;
    private String skin;
    private String eye;
    private String birth;
    private String gender;
    private String img;


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair;
    }

    public void setHair_color(String hair_color) {
        this.hair = hair_color;
    }

    public String getSkin_color() {
        return skin;
    }

    public void setSkin_color(String skin_color) {
        this.skin = skin_color;
    }

    public String getEye_color() {
        return eye;
    }

    public void setEye_color(String eye_color) {
        this.eye = eye_color;
    }

    public String getBirth_year() {
        return birth;
    }

    public void setBirth_year(String birth_year) {
        this.birth = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
