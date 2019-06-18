package com.example.americup.model;

public class Match {
    public String name1;
    public String name2;
    public int Score1;
    public int Score2;
    public int flag1;
    public int flag2;

    public Match(String name1, String name2, int score1, int score2,int mflag1, int mflag2) {
        this.name1 = name1;
        this.name2 = name2;
        Score1 = score1;
        Score2 = score2;
        flag1 = mflag1;
        flag2 = mflag2;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getScore1() {
        return Score1;
    }

    public void setScore1(int score1) {
        Score1 = score1;
    }

    public int getScore2() {
        return Score2;
    }

    public void setScore2(int score2) {
        Score2 = score2;
    }

    public int getFlag1() {
        return flag1;
    }

    public void setFlag1(int flag1) {
        this.flag1 = flag1;
    }

    public int getFlag2() {
        return flag2;
    }

    public void setFlag2(int flag2) {
        this.flag2 = flag2;
    }
}
