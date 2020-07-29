package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView btnRoadmap;
    CardView CardFasilitas;
    CardView cardGalery;
    CardView tentang_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRoadmap = (CardView) findViewById(R.id.roadmap_btn);
        CardFasilitas = (CardView) findViewById(R.id.fasilitas_btn);
        cardGalery = (CardView)  findViewById(R.id.card_galery);
        cardGalery.setOnClickListener(this);
        CardFasilitas.setOnClickListener(this);
        btnRoadmap.setOnClickListener(this);

        tentang_btn = (CardView) findViewById(R.id.tentang_btn);
        tentang_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.roadmap_btn :
                Intent intent =  new Intent(MainActivity.this, RoadmapActivity.class);
                startActivity(intent);
                break;
            case R.id.fasilitas_btn :
                Intent moveToFasilitas = new Intent(MainActivity.this, Fasilitas_Activity.class);
                startActivity(moveToFasilitas);
                break;

            case R.id.card_galery :
                Intent moveToGalery = new Intent(MainActivity.this, Gallery.class);
                startActivity(moveToGalery);
                break;

            case R.id.tentang_btn :
                Intent moveToTentang = new Intent(MainActivity.this,Tentang.class);
                startActivity(moveToTentang);
                break;
        }
    }

}
