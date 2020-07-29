package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Struktur_organisasi extends AppCompatActivity {
  private RecyclerView rorganisasi;
  private ArrayList<Organisasi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur_organisasi);
         rorganisasi = findViewById(R.id.rv_struktur);
         rorganisasi .setHasFixedSize(true);

         list.addAll(Struktur_organisasiData.getListData());
         showRecyclerList();

    }

    private void showRecyclerList() {
        rorganisasi.setLayoutManager(new LinearLayoutManager(this));
        ListOrganisasiAdapter listOrganisasiAdapter = new ListOrganisasiAdapter(list);
        rorganisasi.setAdapter(listOrganisasiAdapter);


    }
}