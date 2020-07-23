package com.example.innosoft;

import java.util.ArrayList;

public class RoadmapData {
    private static String[] roadmapTitle = {
            "Web Engineering",
            "Mobile Software Engineering",
            "Big Data",
            "Computer Vision",
            "Decision Support System",
            "Software Anywhere",
            "Goal"
    };

    private static String[] roadmapDeskripsi = {
      " Web Design \n Web Programming \n Web Service Development \n Web Service Development \n Semantic Web & Ontology",
      " Mobil Apps \n Mobile GPS \n Mobile Game \n Mobile Commerce",
      " Data Mining \n Data Warehouse \n Big Data Algorithm \n Sentiment Analysis",
      " Image Processing \n Text Processing \n Pattern Recognition \n Deep Learning",
      " Forecasting System \n Enterprise Resource Planning \n Enterprise System \n Inteligent System",
      " Cloud Computing \n Internet of Things",
      " Smart Campus"
    };

    private static int[] roadmapImages = {
           R.drawable.web,
           R.drawable.android,
           R.drawable.data,
           R.drawable.computer,
           R.drawable.decision,
           R.drawable.cloud,
           R.drawable.goals
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
