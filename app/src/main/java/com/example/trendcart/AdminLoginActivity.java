package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class AdminLoginActivity extends AppCompatActivity {
    ImageButton backBtn;
    Button adminLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> onBackPressed());

        adminLoginBtn = findViewById(R.id.adminLoginBtn);
        adminLoginBtn.setOnClickListener(v -> startActivity(new Intent(AdminLoginActivity.this, AdminProfileActivity.class)));
    }
}