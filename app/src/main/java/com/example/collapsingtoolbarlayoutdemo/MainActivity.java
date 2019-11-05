package com.example.collapsingtoolbarlayoutdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    ImageView demo1,demo2,demo3,demo4,demo5,demo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        toolbar = findViewById(R.id.toolbar);
        collapsingToolbarLayout = findViewById(R.id.collapsing);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.banner));
        setSupportActionBar(toolbar);
        LoadData();
    }

    private void LoadData() {
        demo1 = findViewById(R.id.demo1);
        demo2 = findViewById(R.id.demo2);
        demo3 = findViewById(R.id.demo3);
        demo4 = findViewById(R.id.demo4);
        demo5 = findViewById(R.id.demo5);
        demo6 = findViewById(R.id.demo6);

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animation1.setStartOffset(100);
        demo1.startAnimation(animation1);
        demo1.setVisibility(View.VISIBLE);

        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animation2.setStartOffset(300);
        demo2.startAnimation(animation2);
        demo2.setVisibility(View.VISIBLE);

        Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animation3.setStartOffset(500);
        demo3.startAnimation(animation3);
        demo3.setVisibility(View.VISIBLE);

        Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animation4.setStartOffset(700);
        demo4.startAnimation(animation4);
        demo4.setVisibility(View.VISIBLE);

        Animation animation5 = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animation5.setStartOffset(900);
        demo5.startAnimation(animation5);
        demo5.setVisibility(View.VISIBLE);

        Animation animation6 = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animation6.setStartOffset(1100);
        demo6.startAnimation(animation6);
        demo6.setVisibility(View.VISIBLE);
    }

}
