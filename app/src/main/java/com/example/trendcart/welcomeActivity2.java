package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class welcomeActivity2 extends AppCompatActivity {
    Button nextBtn;
    ImageButton backBtn;
    ImageView mvBtn1,mvBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        nextBtn = findViewById(R.id.nextbtn);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        nextBtn.setOnClickListener(v -> startActivity(new Intent(welcomeActivity2.this, MainActivity.class)));

        mvBtn1 = findViewById(R.id.mvBtn1);
        mvBtn1.setOnClickListener(v -> startActivity(new Intent(welcomeActivity2.this, welcomeActivity1.class)));
        mvBtn3 = findViewById(R.id.mvBtn3);
        mvBtn3.setOnClickListener(v -> startActivity(new Intent(welcomeActivity2.this, MainActivity.class)));

    }
}