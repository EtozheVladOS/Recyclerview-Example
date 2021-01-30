package com.example.lesson6finaltask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recycleViewAdapter;
    RecyclerView.LayoutManager recycleViewManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> albumItemArrayList = new ArrayList<>();
        albumItemArrayList.add(new AlbumItem(R.drawable.album1, AlbumSource.ALBUM_1_TITLE, AlbumSource.ALBUM_1_DESCRIPTION, AlbumSource.ALBUM_1_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album2, AlbumSource.ALBUM_2_TITLE, AlbumSource.ALBUM_2_DESCRIPTION, AlbumSource.ALBUM_2_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album3, AlbumSource.ALBUM_3_TITLE, AlbumSource.ALBUM_3_DESCRIPTION, AlbumSource.ALBUM_3_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album4, AlbumSource.ALBUM_4_TITLE, AlbumSource.ALBUM_4_DESCRIPTION, AlbumSource.ALBUM_4_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album5, AlbumSource.ALBUM_5_TITLE, AlbumSource.ALBUM_5_DESCRIPTION, AlbumSource.ALBUM_5_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album6, AlbumSource.ALBUM_6_TITLE, AlbumSource.ALBUM_6_DESCRIPTION, AlbumSource.ALBUM_6_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album7, AlbumSource.ALBUM_7_TITLE, AlbumSource.ALBUM_7_DESCRIPTION, AlbumSource.ALBUM_7_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album8, AlbumSource.ALBUM_8_TITLE, AlbumSource.ALBUM_8_DESCRIPTION, AlbumSource.ALBUM_8_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album9, AlbumSource.ALBUM_9_TITLE, AlbumSource.ALBUM_9_DESCRIPTION, AlbumSource.ALBUM_9_TRACKS));
        albumItemArrayList.add(new AlbumItem(R.drawable.album10, AlbumSource.ALBUM_10_TITLE, AlbumSource.ALBUM_10_DESCRIPTION, AlbumSource.ALBUM_10_TRACKS));

        recyclerView = findViewById(R.id.recyclerViewActivity);
        recyclerView.setHasFixedSize(true);
        recycleViewAdapter = new AlbumRecyclerAdapter(albumItemArrayList, this);
        recycleViewManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recycleViewManager);
        recyclerView.setAdapter(recycleViewAdapter);
    }
}