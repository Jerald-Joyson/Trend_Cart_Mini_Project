package com.example.trendcart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdminProfileActivity extends AppCompatActivity {
    LinearLayout layoutAddCategory,layoutAddItem,layoutAdminList;
    TextView categoryTextView,itemTextView;
    ImageView closeCategoryList,closeItemList;
    ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_profile);

        // initialize views
        backBtn = findViewById(R.id.backBtn);
        layoutAddCategory = findViewById(R.id.layoutAddCategory);
        layoutAddItem = findViewById(R.id.layoutAddItem);
        layoutAdminList = findViewById(R.id.layoutAdminList);
        categoryTextView = findViewById(R.id.add_category_list);
        itemTextView = findViewById(R.id.add_item_list);
        closeCategoryList = findViewById(R.id.close_Category_list);
        closeItemList = findViewById(R.id.close_item_list);

        // Set click listeners
        backBtn.setOnClickListener(v -> onBackPressed());
        closeCategoryList.setOnClickListener(v -> {
            layoutAdminList.setVisibility(View.VISIBLE);
            layoutAddCategory.setVisibility(View.GONE);
        });

        closeItemList.setOnClickListener(v -> {
            layoutAdminList.setVisibility(View.VISIBLE);
            layoutAddItem.setVisibility(View.GONE);
        });

        categoryTextView.setOnClickListener(v -> {
            layoutAdminList.setVisibility(View.GONE);
            layoutAddCategory.setVisibility(View.VISIBLE);
        });

        itemTextView.setOnClickListener(v -> {
            layoutAdminList.setVisibility(View.GONE);
            layoutAddItem.setVisibility(View.VISIBLE);
        });
    }
}