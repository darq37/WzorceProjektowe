package com.umcs;

public class Film extends FilmComponent {
    @Override
    public String getFilmName() {
        return filmName;
    }

    @Override
    public String getDirectorName() {
        return directorName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    String filmName;
    String directorName;
    int releaseYear;


    public Film(String filmName, String directorName, int releaseYear) {
        this.filmName = filmName;
        this.directorName = directorName;
        this.releaseYear = releaseYear;
    }

    public void displayFilmInfo(){
        System.out.println(getFilmName() + ", reżyseria: " + getDirectorName() + ", rok wydania: " + getReleaseYear());
    }



}
