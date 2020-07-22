package com.example.innosoft;

import java.util.ArrayList;

public class FasilitasDatas {
    private static String[] fasilitasNames = {

    };

    private static  String[] fasilitasDescription = {

    };

    private  static  String[] fasilitasImages = {

    };

    static ArrayList<Fasilitas> getListData() {
        ArrayList<Fasilitas> list = new ArrayList<>();
        for (int position = 0; position < fasilitasNames.length; position++) {
            Fasilitas fasilitas = new Fasilitas();
            fasilitas.setTitle(fasilitasNames[position]);
            fasilitas.setDescription(fasilitasDescription[position]);
            fasilitas.setImgView(fasilitasImages[position]);
            list.add(fasilitas);
        }
        return list;
    }
}
