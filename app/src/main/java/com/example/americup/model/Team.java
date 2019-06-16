package com.example.americup.model;

import android.widget.ImageView;

public class Team {
    private int id;
    String name;
    int points;
    ImageView imgEquipo;

    private int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPoints(){

        return points;
    }

    public ImageView getImgEquipo() {
        return imgEquipo;
    }



}
