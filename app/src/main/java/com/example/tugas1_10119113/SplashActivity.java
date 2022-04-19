package com.example.tugas1_10119113;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void Exit(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(SplashActivity.this);
        builder.setTitle("Keluar");
        builder.setMessage("Apakah anda ingin keluar?");
        builder.setPositiveButton("Ya", (dialogInterface, i) -> finish());

        builder.setNegativeButton("Tidak", (dialogInterface, i) -> dialogInterface.dismiss());

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void Login(View view) {
        Intent login = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(login);
    }
}
