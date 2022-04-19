package com.example.tugas1_10119113;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Logout(View view) {
        Intent logout = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(logout);
    }

    public void Exit(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Keluar");
        builder.setMessage("Apakah anda ingin keluar?");
        builder.setPositiveButton("Ya", (dialogInterface, i) -> finish());

        builder.setNegativeButton("Tidak", (dialogInterface, i) -> dialogInterface.dismiss());

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void toProfil(View view) {
        Intent profil = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(profil);
    }
}
