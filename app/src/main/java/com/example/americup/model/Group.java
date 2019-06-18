package com.example.americup.model;

import java.util.ArrayList;

public class Group {
    private int id;
    public String name;
    public ArrayList<Team> teamList;

    private int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public ArrayList getTeamList(){
        return teamList;
    }
}
