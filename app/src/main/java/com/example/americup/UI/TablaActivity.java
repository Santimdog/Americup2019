package com.example.americup.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.americup.R;

public class TablaActivity extends AppCompatActivity  {
    private ImageButton btnMenu;
    private Button groupListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);
        btnMenu = findViewById(R.id.btnMenu);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMenu();
            }
        });
    }


    private void goToMenu() {
       // setContentView(R.layout.activity_main);
        onBackPressed();
        finish();

    }
}
