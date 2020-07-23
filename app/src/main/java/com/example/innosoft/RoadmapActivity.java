package com.example.innosoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RoadmapActivity extends AppCompatActivity {
    ArrayList<Roadmap> list = new ArrayList<>();
    private RecyclerView rvRoadmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadmap);

        rvRoadmap = findViewById(R.id.rv_roadmap2);
        rvRoadmap.setHasFixedSize(true);


        list.addAll(RoadmapData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvRoadmap.setLayoutManager(new LinearLayoutManager(this));

        ListRoadmapAdapter listRoadmapAdapter = new ListRoadmapAdapter(list);
        rvRoadmap.setAdapter(listRoadmapAdapter);
    }
}