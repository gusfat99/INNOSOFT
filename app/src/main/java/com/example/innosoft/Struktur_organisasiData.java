package com.example.innosoft;

import java.util.ArrayList;

public class Struktur_organisasiData {
    private static String[] jabatan = {
            "Kepala Lab RPL",
            "Mobile Programming",
            "Visual Programming",
            "Artificial Intelligence",
            "Ekspert System",
            "Web Programming",
            "Multimedia Design",
            "System Programming",
            "Math And Statistics",

    };

    private static String[] nama = {
            "Safarudin Hidayat Al-Ikhsan,S.Kom.,M.Kom",
            "Safarudin Hidayat Al-Ikhsan,S.Kom.,M.Kom",
            "Dr.Givi Efgivia, M.Kom",
            "Gibtha Fitri Laxmi,M.Kom",
            "Berlina Wulandari, S.T.,M.Kom",
            "Dr.Foni Agus Setiawan,M.Kom",
            "Hersanto Fajri,S.Ds.,M.M.D",
            "Fitrah Satrya Fajar K.,S.Komp.,M.Kom",
            "Frezza Riana, S.Si.,M.Si"

    };

    private static int[] strukturImages = {
            R.drawable.paksafar,
            R.drawable.paksafar,
            R.drawable.pakgivi,
            R.drawable.bughibta,
            R.drawable.buberlin,
            R.drawable.pakfoni,
            R.drawable.pakhersanto,
            R.drawable.pakfitrah,
            R.drawable.bufreza
    };

    static ArrayList<Organisasi> getListData() {
        ArrayList<Organisasi> list = new ArrayList<>();
        for (int position = 0; position < jabatan.length; position++) {
            Organisasi organisasi = new Organisasi();
            organisasi.setJabatan(jabatan[position]);
            organisasi.setNama(nama[position]);
            organisasi.setImgView(strukturImages[position]);
            list.add(organisasi);
        }
        return list;
    }
}
