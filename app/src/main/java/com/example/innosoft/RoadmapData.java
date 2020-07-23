package com.example.innosoft;

import java.util.ArrayList;

public class RoadmapData {
    private static String[] roadmapTitle = {
            "Web Engineering",
            "Mobile Software Engineering",
            "Big Data",
            "Goal",
            "Computer Vision",
            "Decision Support System",
            "Software Anywhere"
    };

    private static String[] roadmapDeskripsi = {
      " Web Design \n Web Programming \n Web Service Development \n Web Service Development \n Semantic Web & Ontology",
      " Mobil Apps \n Mobile GPS \n Mobile Game \n Mobile Commerce",
      " Data Mining \n Data Warehouse \n Big Data Algorithm \n Sentiment Analysis",
      " Smart Campus",
      " Image Processing \n Text Processing \n Pattern Recognition \n Deep Learning",
      " Forecasting System \n Enterprise Resource Planning \n Enterprise System \n Inteligent System",
      " Cloud Computing \n Internet of Things"
    };

    private static int[] roadmapImages = {
           R.drawable.web,
           R.drawable.android,
           R.drawable.data,
           R.drawable.goals,
           R.drawable.computer,
           R.drawable.decision,
           R.drawable.cloud
    };

    static ArrayList<Roadmap> getListData() {
        ArrayList<Roadmap> list = new ArrayList<>();
        for (int position = 0; position < roadmapTitle.length; position++) {
            Roadmap roadmap = new Roadmap();
            roadmap.setTitle(roadmapTitle[position]);
            roadmap.setDeskripsi(roadmapDeskripsi[position]);
            roadmap.setImageView(roadmapImages[position]);
            list.add(roadmap);
        }
        return list;
    }
}
