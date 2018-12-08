package com.umcs;

public class Repertuar {
    FilmComponent filmList;

    public Repertuar(FilmComponent newSongList) {
        filmList = newSongList;
    }

    public void getFilmList(){
        filmList.displayFilmInfo();
    }

}
