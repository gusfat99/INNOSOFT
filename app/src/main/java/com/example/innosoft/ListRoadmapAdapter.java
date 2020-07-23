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

public class ListRoadmapAdapter extends RecyclerView.Adapter<ListRoadmapAdapter.ListViewHolder> {
    private ArrayList<Roadmap> listRoadmap;

    public ListRoadmapAdapter(ArrayList<Roadmap> list) {
        this.listRoadmap = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_roadmap, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Roadmap roadmap = listRoadmap.get(position);
        Glide.with(holder.itemView.getContext())
                .load(roadmap.getImageView())
                .apply(new RequestOptions().override(95, 95))
                .into(holder.imgPhoto);
        holder.tvName.setText(roadmap.getTitle());
        holder.tvDeskripsi.setText(roadmap.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listRoadmap.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDeskripsi;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_roadmap2);
            tvName = itemView.findViewById(R.id.tv_item_name_roadmap);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_deskripsi_roadmap);
        }
    }


}
