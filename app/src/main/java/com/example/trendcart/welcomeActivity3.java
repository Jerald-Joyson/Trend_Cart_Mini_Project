package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class welcomeActivity3 extends AppCompatActivity {
Button loginBtn,createAccBtn;
ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome3);
        createAccBtn = findViewById(R.id.createAccBtn);
        loginBtn = findViewById(R.id.loginbtn);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        loginBtn.setOnClickListener(v -> startActivity(new Intent(welcomeActivity3.this, MainActivity.class)));
        createAccBtn.setOnClickListener(v -> startActivity(new Intent(welcomeActivity3.this, MainActivity.class)));
    }
}