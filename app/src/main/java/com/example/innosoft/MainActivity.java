package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahvisimisi(View view) {
        Intent intent = new Intent(MainActivity.this, VisiMisi.class);
        startActivity(intent);
    }
}
