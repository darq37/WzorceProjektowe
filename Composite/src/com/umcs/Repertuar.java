package com.umcs;

public class Repertuar {
    FilmComponent filmList;

    public Repertuar(FilmComponent newFilmList) {
        filmList = newFilmList;
    }

    public void getFilmList(){
        filmList.displayFilmInfo();
    }

}
