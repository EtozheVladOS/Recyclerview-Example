package com.example.lesson6finaltask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlbumRecyclerAdapter extends RecyclerView.Adapter <AlbumRecyclerAdapter.AlbumRecyclerAdapterViewHolder>{

    private ArrayList<AlbumItem> albumItemArrayList;
    Context context;


    public class AlbumRecyclerAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView titleText;
        public TextView descriptionText;


        public AlbumRecyclerAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.albumImageViewItem);
            titleText = itemView.findViewById(R.id.titleTextViewItem);
            descriptionText = itemView.findViewById(R.id.descriptionTextViewItem);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();  //номер позиции адаптера
            AlbumItem albumItem = albumItemArrayList.get(position); // создаем объект и вытягиваем данные из array в него

            Intent intent = new Intent(context, RecipeActivity.class);

            intent.putExtra("title", albumItem.getAlbumTitleText());
            intent.putExtra("description", albumItem.getAlbumDescriptionText());
            intent.putExtra("albumImage", albumItem.getAlbumImageView());
            intent.putExtra("tracks", albumItem.getTracks());
            context.startActivity(intent);       //запускать активити через контекст, тк данный класс AlbumRecyclerAdapter является адаптером, а не актвиити
        }
    }

    public AlbumRecyclerAdapter (ArrayList<AlbumItem> albumItemArrayList, Context context) {
        this.albumItemArrayList = albumItemArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public AlbumRecyclerAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item, parent, false);
        AlbumRecyclerAdapterViewHolder albumRecyclerAdapterViewHolder = new AlbumRecyclerAdapterViewHolder(view);
        return albumRecyclerAdapterViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumRecyclerAdapterViewHolder holder, int position) {
        AlbumItem albumItem = albumItemArrayList.get(position);

        holder.imageView.setImageResource(albumItem.getAlbumImageView());
        holder.titleText.setText(albumItem.getAlbumTitleText());
        holder.descriptionText.setText(albumItem.getAlbumDescriptionText());
    }

    @Override
    public int getItemCount() {
        return albumItemArrayList.size();
    }
}
