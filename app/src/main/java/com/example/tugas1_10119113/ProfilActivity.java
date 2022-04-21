package com.example.tugas1_10119113;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Button exit = findViewById(R.id.btn_exit);
        Button logout = findViewById(R.id.btn_logout);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(ProfilActivity.this);
                builder.setTitle("Keluar");
                builder.setMessage("Apakah anda ingin keluar?");
                builder.setPositiveButton("Ya", (new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
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
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
