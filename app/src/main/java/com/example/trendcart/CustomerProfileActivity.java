package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomerProfileActivity extends AppCompatActivity {
    LinearLayout bottomNavigation;
    ImageView homeNavi,categoryNavi,cartNavi,favoriteNavi,profileNavi;
    ImageButton backBtn;
    TextView myProfileList,editPassList,yourOrdersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_profile);

        myProfileList = findViewById(R.id.my_profile_list);
        editPassList = findViewById(R.id.edit_pass_list);
        yourOrdersList = findViewById(R.id.your_orders_list);
        bottomNavigation = findViewById(R.id.bottomNavi);
        homeNavi = findViewById(R.id.home_screen_navi);
        categoryNavi = findViewById(R.id.category_screen_navi);
        cartNavi = findViewById(R.id.cart_screen_navi);
        favoriteNavi = findViewById(R.id.favorite_screen_navi);
        profileNavi = findViewById(R.id.profile_navi);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        homeNavi.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerHomeActivity.class)));
        favoriteNavi.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerFavoriteActivity.class)));
        categoryNavi.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerCategoryActivity.class)));
        cartNavi.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerCartActivity.class)));
        ColorStateList colorStateList = ContextCompat.getColorStateList(getApplicationContext(), R.color.my_primary);
        profileNavi.setBackgroundTintList(colorStateList);
        myProfileList.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerProfileEditActivity.class)));
        editPassList.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerProfilePswdActivity.class)));
        yourOrdersList.setOnClickListener(v -> startActivity(new Intent(CustomerProfileActivity.this, CustomerProfileOrderActivity.class)));


    }
}