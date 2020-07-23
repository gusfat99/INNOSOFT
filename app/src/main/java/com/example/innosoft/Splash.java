package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;

public class Splash extends AppCompatActivity {
    RelativeLayout relativeLayout;
    AnimationDrawable animationDrawable;

    private int waktu =  5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splscreen = new Intent(Splash.this, MainActivity.class);
                startActivity(splscreen);
                finish();
            }
        }, waktu);
    }

}