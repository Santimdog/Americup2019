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
        btnTabla = findViewById(R.id.btntabla);
        btnPlayer = findViewById(R.id.btnjugador);
        btnScore = findViewById(R.id.btnmarcador);
        btnTabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTabla();
            }
        });

    }

    private void goToTabla() {

        Intent intentTabla= new Intent(this, Tabla.class);
        startActivity(intentTabla);
    }

}
