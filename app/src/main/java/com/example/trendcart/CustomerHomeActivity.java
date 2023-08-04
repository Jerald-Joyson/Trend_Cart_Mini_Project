package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CustomerHomeActivity extends AppCompatActivity {
    LinearLayout bottomNavigation;
    ImageView homeNavi,categoryNavi,cartNavi,favoriteNavi,profileNavi;
    ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);
        bottomNavigation = findViewById(R.id.bottomNavi);
        homeNavi = findViewById(R.id.home_screen_navi);
        categoryNavi = findViewById(R.id.category_screen_navi);
        cartNavi = findViewById(R.id.cart_screen_navi);
        favoriteNavi = findViewById(R.id.favorite_screen_navi);
        profileNavi = findViewById(R.id.profile_navi);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        ColorStateList colorStateList = ContextCompat.getColorStateList(getApplicationContext(), R.color.my_primary);
        homeNavi.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
        categoryNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerCategoryActivity.class)));
        cartNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerCartActivity.class)));
        favoriteNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerFavoriteActivity.class)));
        profileNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerProfileActivity.class)));
    }
}