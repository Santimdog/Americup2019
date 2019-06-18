package com.example.americup.model;

public class Team {
    private int id;
    public String name;
    public int points;
    public int flag;


    public Team(int id, String name, int points, int flag) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPoints(){

        return points;
    }
    public int getFlag() {
        return flag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
