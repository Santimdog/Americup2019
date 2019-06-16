package com.example.americup.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.americup.R;

import java.util.ArrayList;

public class TablaActivity extends AppCompatActivity  {
    private ImageButton btnMenu;
    private ImageButton groupListBtn;
    static final private int groupA = Menu.FIRST;
    static final private int groupB = Menu.FIRST+1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);
        btnMenu = findViewById(R.id.btnMenu);
        groupListBtn= findViewById(R.id.imageButtonDownArrow);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        final TextView myEditText = findViewById(R.id.groupSelectTextView);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMenu();
            }
        });

        registerForContextMenu(groupListBtn);

       /* final ArrayList<String> todoItems = new ArrayList<String>();
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);
        // Bind the array adapter to the listview.
        myListView.setAdapter(aa);*/

        final ArrayList<Button> groupList = new ArrayList<Button>();
        final ArrayAdapter<Button> groupAdapt;
        groupAdapt = new ArrayAdapter<Button>(this, android.R.layout.simple_expandable_list_item_1, groupList);
        myListView.setAdapter(groupAdapt);

       /* groupListBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                groupList.add(0,
                        myEditText.getText().toString());
                groupAdapt.notifyDataSetChanged();
                myEditText.setText("");
            }
        });*/
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
    }
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case (groupA): {
                AdapterView.AdapterContextMenuInfo menuInfo;
               /* menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
                int index = menuInfo.position;
                removeItem(index);*/
                goToMenu();
                return true;
            }
        }
        return false;
    }
}
