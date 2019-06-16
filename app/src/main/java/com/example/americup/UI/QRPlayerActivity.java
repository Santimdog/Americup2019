package com.example.americup.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.americup.R;

public class QRPlayerActivity extends AppCompatActivity{
private ImageButton btnMenu;
private ImageButton btnQR;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrplayer);
        btnMenu = findViewById(R.id.btnMenu);
        btnQR = findViewById(R.id.qrBtn);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMenu();
            }
        });
        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scanQR();
            }
        });
    }

    private void scanQR() {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.initiateScan();
    }

    private void goToMenu() {
        onBackPressed();
        finish();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (resultCode == RESULT_OK) {
            IntentResult scanResult = IntentIntegrator.parseActivityResult(
                    requestCode, resultCode, intent);
            if (scanResult != null) {
                // Handle successful scan
                String contents = scanResult.getContents();

                    final TextView qrResult = findViewById(R.id.textViewQrResult);
                    qrResult.setText(contents);

            }
        } else if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Scan canceled", Toast.LENGTH_SHORT)
                    .show();
        }

    }


}
