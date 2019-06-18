package com.example.americup.UI;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.americup.R;
import com.example.americup.model.Team;

import java.util.ArrayList;

public class TeamListFragment extends Fragment {
    private ArrayList<Team> TeamList = new ArrayList<Team>();

    public TeamListFragment(){

    }
    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        View view= inflater.inflate(R.layout.team_list_layout,container,false);
        return view;
    }
}