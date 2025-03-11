package com.example.animationinandroid;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewKt;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    AppCompatButton bounce, fadeOut, fadeIn, fromRight, middleToTop, slideFromLeft, upDown, zoomIn;
    ImageView panda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //Status bar color
        getWindow().setStatusBarColor(Color.parseColor("#00C853") );
        //Navigation bar color
        getWindow().setNavigationBarColor(Color.parseColor("#16db1d") );
        setContentView(R.layout.activity_main);

        panda = findViewById(R.id.panda);
        bounce = findViewById(R.id.bounce);
        fadeIn = findViewById(R.id.fadeIn);
        fadeOut = findViewById(R.id.fadeOut);
        fromRight = findViewById(R.id.fromRight);
        middleToTop = findViewById(R.id.middleToTop);
        slideFromLeft = findViewById(R.id.slideFromLeft);
        upDown = findViewById(R.id.upDown);
        zoomIn = findViewById(R.id.zoomIn);

        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation bounce = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce_effect);
                panda.startAnimation(bounce);
            }
        });
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade__out);
                panda.startAnimation(fadeOut);
            }
        });
        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
                panda.startAnimation(fadeIn);
            }
        });
        middleToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation middleToTop = AnimationUtils.loadAnimation(MainActivity.this, R.anim.middle_to_top);
                panda.startAnimation(middleToTop);
            }
        });
        slideFromLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation slideFromLeft = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_from_left);
                panda.startAnimation(slideFromLeft);
            }
        });
        upDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation upDown = AnimationUtils.loadAnimation(MainActivity.this, R.anim.up_down);
                panda.startAnimation(upDown);
            }
        });
        zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
                panda.startAnimation(zoomIn);
            }
        });
        fromRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fromRight = AnimationUtils.loadAnimation(MainActivity.this, R.anim.from_right);
                panda.startAnimation(fromRight);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}