package com.example.trendcart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class CustomerHomeActivity extends AppCompatActivity {
    LinearLayout bottomNavigation;
    ImageView homeNavi,categoryNavi,cartNavi,favoriteNavi,profileNavi;
    ImageButton backBtn;
    private ViewPager2 viewPager2;
    private Handler sliderHandler = new android.os.Handler();
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
        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        backBtn.setOnClickListener(v -> onBackPressed());
        ColorStateList colorStateList = ContextCompat.getColorStateList(getApplicationContext(), R.color.my_primary);
        homeNavi.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
        categoryNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerCategoryActivity.class)));
        cartNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerCartActivity.class)));
        favoriteNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerFavoriteActivity.class)));
        profileNavi.setOnClickListener(v -> startActivity(new Intent(CustomerHomeActivity.this, CustomerProfileActivity.class)));

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.image6));
        sliderItems.add(new SliderItem(R.drawable.image2));
        sliderItems.add(new SliderItem(R.drawable.image3));
        sliderItems.add(new SliderItem(R.drawable.image4));
        sliderItems.add(new SliderItem(R.drawable.image5));

        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r=1-Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable,2000);
            }
        });
    }
    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable,2000);
    }
}