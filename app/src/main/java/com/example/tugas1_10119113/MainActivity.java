package com.example.tugas1_10119113;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profil = findViewById(R.id.btn_profil);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(profil);
            }
        });

        Button logout = findViewById(R.id.btn_logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(profil);
            }
        });

        Button exit = findViewById(R.id.btn_exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Keluar");
                builder.setMessage("Apakah anda ingin keluar?");
                builder.setPositiveButton("Ya", (new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        moveTaskToBack(true);
                    }
                }));

                builder.setNegativeButton("Tidak", (new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }));

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}
