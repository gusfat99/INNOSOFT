package com.example.innosoft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class ListOrganisasiAdapter extends RecyclerView.Adapter<ListOrganisasiAdapter.ListViewHolder>  {
        private ArrayList<Organisasi> listorganisasi;

        public ListOrganisasiAdapter(ArrayList<Organisasi> list){
         this.listorganisasi = list;
        }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_struktur,parent,false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Organisasi organisasi = listorganisasi.get(position);
        Glide.with(holder.itemView.getContext())
                .load(organisasi.getImgView())
                .apply(new RequestOptions().override(95,95))
                .into(holder.imageView);
        holder.jabatan.setText(organisasi.getJabatan());
        holder.nama.setText(organisasi.getNama());
    }

    @Override
    public int getItemCount() { return  listorganisasi.size();}

    public class ListViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView ;
            TextView jabatan, nama;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_struktur_organisasi);
            jabatan = itemView.findViewById(R.id.jabatan);
            nama = itemView.findViewById(R.id.nama);
        }
    }
}
