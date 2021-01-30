package com.example.lesson6finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView tracks = findViewById(R.id.tracksTextView);
        ImageView albumImage = findViewById(R.id.albumImageView);

        Intent intent = getIntent();
        if (intent != null) {
            title.setText(intent.getStringExtra("title"));
            tracks.setText(intent.getStringExtra("tracks"));
            albumImage.setImageResource(intent.getIntExtra("albumImage", R.drawable.album1));
        }
    }
}