package com.example.lesson6finaltask;

public class AlbumItem {
    private int albumImageView;
    private String albumTitleText;
    private String albumDescriptionText;
    private String tracks;

    public AlbumItem(int albumImageView, String albumTitleText, String albumDescriptionText, String tracks) {
        this.albumImageView = albumImageView;
        this.albumTitleText = albumTitleText;
        this.albumDescriptionText = albumDescriptionText;
        this.tracks = tracks;
    }

    public String getTracks() {
        return tracks;
    }

    public int getAlbumImageView() {
        return albumImageView;
    }

    public String getAlbumTitleText() {
        return albumTitleText;
    }

    public String getAlbumDescriptionText() {
        return albumDescriptionText;
    }
}
