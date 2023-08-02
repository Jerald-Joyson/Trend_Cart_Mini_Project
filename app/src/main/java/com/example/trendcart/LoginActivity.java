package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    ImageButton backBtn;
    TextView adminLogin,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        adminLogin = findViewById(R.id.adminLoginView);
        adminLogin.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, AdminLoginActivity.class)));
        signUp = findViewById(R.id.signUpView);
        signUp.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, SignupActivity.class)));
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> onBackPressed());


    }
}