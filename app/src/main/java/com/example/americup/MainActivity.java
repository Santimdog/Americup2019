package com.example.americup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btntabla;
Button btnjugador;
Button btnmarcador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntabla= findViewById(R.id.btntabla);
        btnjugador= findViewById(R.id.btnjugador);
        btnmarcador= findViewById(R.id.btnmarcador);
        btntabla.setOnClickListener(this);
        btnjugador.setOnClickListener(this);
        btnmarcador.setOnClickListener(this);
        //gototabla();

    }

    private void gototabla() {
        setContentView(R.layout.activity_tabla);
    }

    @Override
    public void onClick(View v) {


    }
}
