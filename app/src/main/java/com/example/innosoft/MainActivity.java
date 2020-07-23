package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView btnRoadmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRoadmap = (CardView) findViewById(R.id.roadmap_btn);

        btnRoadmap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.roadmap_btn :
                Intent intent =  new Intent(MainActivity.this, RoadmapActivity.class);
                startActivity(intent);
                break;
        }

    }
}
