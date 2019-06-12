package com.example.americup.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.americup.R;

public class MainActivity extends AppCompatActivity {
Button btnTabla;
Button btnPlayer;
Button btnScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTabla = findViewById(R.id.btnTabla);
        btnPlayer = findViewById(R.id.btnPlayer);
        btnScore = findViewById(R.id.btnScore);
        btnTabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTabla();
            }
        });
        btnPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToQRPlayer();
            }
        });

    }


    private void goToTabla() {

        Intent intentTabla= new Intent(this, TablaActivity.class);
        startActivity(intentTabla);
    }

    private void goToQRPlayer() {

        Intent intentQRPlayer= new Intent(this,QRPlayerActivity.class);
        startActivity(intentQRPlayer);
    }

}
