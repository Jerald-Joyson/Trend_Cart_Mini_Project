
package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button loginBtn, createAccBtn;
    ImageButton backBtn;
    ImageView mvBtn1,mvBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAccBtn = findViewById(R.id.createAccBtn);
        loginBtn = findViewById(R.id.loginbtn);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        loginBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LoginActivity.class)));
//        createAccBtn.setOnClickListener(v -> startActivity(new Intent(welcomeActivity3.this, MainActivity.class)));
        mvBtn1 = findViewById(R.id.mvBtn1);
        mvBtn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, welcomeActivity1.class)));
        mvBtn2 = findViewById(R.id.mvBtn2);
        mvBtn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, welcomeActivity2.class)));
    }
}