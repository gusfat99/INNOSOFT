package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Fasilitas_Activity extends AppCompatActivity {
    private RecyclerView rvFasilitas;
    private ArrayList<Fasilitas> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);
        rvFasilitas = findViewById(R.id.rv_fasilitas);
        rvFasilitas.setHasFixedSize(true);

        list.addAll(FasilitasDatas.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvFasilitas.setLayoutManager(new LinearLayoutManager(this));
        ListFasilitasAdaptor listFasilitasAdaptor = new ListFasilitasAdaptor(list);
        rvFasilitas.setAdapter(listFasilitasAdaptor);
    }
}