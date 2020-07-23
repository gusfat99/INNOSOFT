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

public class ListFasilitasAdaptor extends RecyclerView.Adapter<ListFasilitasAdaptor.ListViewHolder> {
    private ArrayList<Fasilitas> listFasilitas;

    public ListFasilitasAdaptor(ArrayList<Fasilitas> list) {
        this.listFasilitas = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_fasilitas, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Fasilitas fasilitas = listFasilitas.get(position);
        Glide.with(holder.itemView.getContext())
                .load(fasilitas.getImgView())
                .apply(new RequestOptions().override(95,95))
                .into(holder.imageView);
        holder.tvName.setText(fasilitas.getTitle());
        holder.tvDescription.setText(fasilitas.getDescription());
    }

    @Override
    public int getItemCount() {
        return listFasilitas.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName, tvDescription;
        public ListViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_item_photo_fasilitas);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_deskripsi_fasilitas);
        }
    }
}
