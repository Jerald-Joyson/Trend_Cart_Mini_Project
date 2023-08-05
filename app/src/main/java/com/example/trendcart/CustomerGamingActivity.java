package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomerGamingActivity extends AppCompatActivity {
    GridLayout GamingListItems, xboxPSList;
    RelativeLayout xboxPSGamingCategory, keyboardGamingCategory, chairGamingCategory, monitorGamingCategory;
    TextView gamingCategoryItemName, itemName1, itemName2, itemName3, itemName4;
    LinearLayout bottomNavigation;
    ImageView homeNavi,categoryNavi,cartNavi,favoriteNavi,profileNavi;
    ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_gaming);
        GamingListItems = findViewById(R.id.GamingListItems);
        xboxPSList = findViewById(R.id.xboxPSList);
        gamingCategoryItemName = findViewById(R.id.gamingCategoryItemName);

        keyboardGamingCategory = findViewById(R.id.keyboardGamingCategory);
        itemName1 = findViewById(R.id.keyboardItemName);
        monitorGamingCategory = findViewById(R.id.monitorGamingCategory);
        itemName2 = findViewById(R.id.monitorItemName);
        xboxPSGamingCategory = findViewById(R.id.xboxPSGamingCategory);
        itemName3 = findViewById(R.id.xboxPSitemName);
        chairGamingCategory = findViewById(R.id.chairGamingCategory);
        itemName4 = findViewById(R.id.chairItemName);

        bottomNavigation = findViewById(R.id.bottomNavi);
        homeNavi = findViewById(R.id.home_screen_navi);
        categoryNavi = findViewById(R.id.category_screen_navi);
        cartNavi = findViewById(R.id.cart_screen_navi);
        favoriteNavi = findViewById(R.id.favorite_screen_navi);
        profileNavi = findViewById(R.id.profile_navi);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> onBackPressed());
        homeNavi.setOnClickListener(v -> startActivity(new Intent(CustomerGamingActivity.this, CustomerHomeActivity.class)));
        ColorStateList colorStateList = ContextCompat.getColorStateList(getApplicationContext(), R.color.my_primary);
        categoryNavi.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
        cartNavi.setOnClickListener(v -> startActivity(new Intent(CustomerGamingActivity.this, CustomerCartActivity.class)));
        favoriteNavi.setOnClickListener(v -> startActivity(new Intent(CustomerGamingActivity.this, CustomerFavoriteActivity.class)));
        profileNavi.setOnClickListener(v -> startActivity(new Intent(CustomerGamingActivity.this, CustomerProfileActivity.class)));


        keyboardGamingCategory.setOnClickListener(v -> {
            String name = itemName1.getText().toString();
            GamingListItems.setVisibility(View.GONE);
            xboxPSList.setVisibility(View.VISIBLE);
            gamingCategoryItemName.setText(name);
        });
        monitorGamingCategory.setOnClickListener(v -> {
            String name = itemName2.getText().toString();
            GamingListItems.setVisibility(View.GONE);
            xboxPSList.setVisibility(View.VISIBLE);
            gamingCategoryItemName.setText(name);
        });
        xboxPSGamingCategory.setOnClickListener(v -> {
            String name = itemName3.getText().toString();
            GamingListItems.setVisibility(View.GONE);
            xboxPSList.setVisibility(View.VISIBLE);
            gamingCategoryItemName.setText(name);
        });
        chairGamingCategory.setOnClickListener(v -> {
            String name = itemName4.getText().toString();
            GamingListItems.setVisibility(View.GONE);
            xboxPSList.setVisibility(View.VISIBLE);
            gamingCategoryItemName.setText(name);
        });
    }
}