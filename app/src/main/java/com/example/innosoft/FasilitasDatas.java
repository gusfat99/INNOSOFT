package com.example.innosoft;

import java.util.ArrayList;

public class FasilitasDatas {
    private static String[] fasilitasNames = {
        "Komputer dengan Spesifikasi CORE-I5",
        "Dispener air",
        "Rak Buku",
        "Wifi",
        "Proyektor",
        "Ruang Diskusi",
        "Ruang Dosen",
        "AC",
        "Microcontroller"
    };

    private static  String[] fasilitasDescription = {
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-"
    };

    private  static int[] fasilitasImages = {
        R.drawable.pc,
        R.drawable.dispenser,
        R.drawable.rak,
        R.drawable.wifi,
        R.drawable.proyektor,
        R.drawable.rdiskusi,
        R.drawable.rdosen,
        R.drawable.ac,
        R.drawable.micro

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
