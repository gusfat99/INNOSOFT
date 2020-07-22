package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView CardFasilitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardFasilitas = (CardView) findViewById(R.id.fasilitas_btn);
        CardFasilitas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fasilitas_btn :
                Intent intent = new Intent(MainActivity.this, Fasilitas_Activity.class);
                startActivity(intent);
                break;
        }
    }
}
