package com.example.americup.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.americup.R;
import com.example.americup.model.Team;
import com.example.americup.model.TeamAdapter;
import com.example.americup.model.teamListAdapter;

import java.util.ArrayList;

public class TablaActivity extends AppCompatActivity  {
    private ImageButton btnMenu;
    private ImageButton groupListBtn;
    static final private int groupA = Menu.FIRST;
    static final private int groupB = Menu.FIRST+1;
    static final private int groupC = Menu.FIRST+2;
    RecyclerView recyclerView;
    ArrayList<Team> teamList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);
        btnMenu = findViewById(R.id.btnMenu);
        groupListBtn= findViewById(R.id.imageButtonDownArrow);
        recyclerView = findViewById(R.id.myTeamListView);

        teamList = new ArrayList<>();
        final TextView myEditText = findViewById(R.id.groupSelectTextView);

        //**************Teams definition***********************
        Team bra = new Team(1,"Brasil",3,R.drawable.flagbrazil);
        Team bol = new Team(2,"Bolivia",0,R.drawable.flagbolivia);
        Team per = new Team(3,"Peru",3,R.drawable.flagperu);
        Team ven = new Team(4,"Venezuela",0,R.drawable.flagvenezuela);
        Team col = new Team(5,"Colombia",3,R.drawable.flagcolombia);

        teamList.add(bra);
        teamList.add(bol);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager myTeamListViewManager = layoutManager;
        recyclerView.setLayoutManager(myTeamListViewManager);

        TeamAdapter adapter = new TeamAdapter(this,teamList);
        //recyclerView.setAdapter(adapter);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMenu();
            }
        });

        registerForContextMenu(groupListBtn);
        groupListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMsg("Mantener presionado");
            }
        });

       /* final ArrayList<String> todoItems = new ArrayList<String>();
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);
        // Bind the array adapter to the listview.
        myListView.setAdapter(aa);*/
       //*****************Groups definition by ArrayList*****************
       ArrayList<Team> grpA = new ArrayList<>();
       grpA.add(bra);
       /*grpA.add(bol);
       grpA.add(per);
       grpA.add(ven);*/

        //teamListAdapter adapter = new teamListAdapter(this, R.layout.team_list_layout, grpA);
        //final ArrayAdapter<Team> groupAdapt;
        //groupAdapt = new ArrayAdapter<Team>(this, R.layout.team_list_layout, grpA);
        //myListView.setAdapter(adapter);

    }

    private void goToMenu() {
       // setContentView(R.layout.activity_main);
        onBackPressed();
        finish();

    }
    //Create the context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle(R.string.menu_title);
        menu.add(0, groupA, Menu.NONE, R.string.grpA);
        menu.add(1, groupB, Menu.NONE, R.string.grpB);
        menu.add(2, groupC, Menu.NONE, R.string.grpC);
    }
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case (groupA): {
                toastMsg("Mostrando grupo A");
                /* groupListBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                groupList.add(0,
                        myEditText.getText().toString());
                groupAdapt.notifyDataSetChanged();
                myEditText.setText("");
            }
        });*/
                return true;
            }
            case (groupB):{
                toastMsg("Mostrando grupo B");
                return false;
            }
            case (groupC): {
                toastMsg("Mostrando grupo C");
                return true;
            }
        }
        return false;
    }
    private void toastMsg(String msg){
        Toast.makeText(TablaActivity.this,msg, Toast.LENGTH_SHORT).show();


    }

}
