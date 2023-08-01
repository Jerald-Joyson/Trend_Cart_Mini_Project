package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class welcomeActivity1 extends AppCompatActivity {
    Button nextBtn;
    ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);
        nextBtn = findViewById(R.id.nextbtn);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());

        nextBtn.setOnClickListener(v -> startActivity(new Intent(welcomeActivity1.this, welcomeActivity2.class)));
    }
}