package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CustomerCategoryActivity extends AppCompatActivity {
    LinearLayout bottomNavigation,categoryListItem;
    LinearLayout categoryGamingList;
    ImageView homeNavi,categoryNavi,cartNavi,favoriteNavi,profileNavi;
    ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_category);

        bottomNavigation = findViewById(R.id.bottomNavi);
        categoryListItem = findViewById(R.id.category_list_item);
        categoryGamingList = findViewById(R.id.categoryGamingList);
        homeNavi = findViewById(R.id.home_screen_navi);
        categoryNavi = findViewById(R.id.category_screen_navi);
        cartNavi = findViewById(R.id.cart_screen_navi);
        favoriteNavi = findViewById(R.id.favorite_screen_navi);
        profileNavi = findViewById(R.id.profile_navi);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        homeNavi.setOnClickListener(v -> startActivity(new Intent(CustomerCategoryActivity.this, CustomerHomeActivity.class)));
        ColorStateList colorStateList = ContextCompat.getColorStateList(getApplicationContext(), R.color.my_primary);
        categoryNavi.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
        cartNavi.setOnClickListener(v -> startActivity(new Intent(CustomerCategoryActivity.this, CustomerCartActivity.class)));
        favoriteNavi.setOnClickListener(v -> startActivity(new Intent(CustomerCategoryActivity.this, CustomerFavoriteActivity.class)));
        profileNavi.setOnClickListener(v -> startActivity(new Intent(CustomerCategoryActivity.this, CustomerProfileActivity.class)));
        categoryGamingList.setOnClickListener(v -> startActivity(new Intent(CustomerCategoryActivity.this, CustomerGamingActivity.class)));

    }
}