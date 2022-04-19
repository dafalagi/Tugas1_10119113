package com.example.tugas1_10119113;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void toSplash(View view) {
        Intent splash = new Intent(LoginActivity.this, SplashActivity.class);
        startActivity(splash);
    }

    public void toRegister(View view) {
        Intent reg = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(reg);
    }

    public void toMain(View view) {
        Intent main = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(main);
    }
}
