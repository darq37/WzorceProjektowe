package com.umcs;


public  abstract class FilmComponent {
    public void add(FilmComponent newFilmComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(FilmComponent newFilmComponent){
        throw new UnsupportedOperationException();
    }
    public FilmComponent getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }
    public String getFilmName(){
        throw new UnsupportedOperationException();
    }
    public String getDirectorName(){
        throw new UnsupportedOperationException();
    }
    public int getReleaseYear(){
        throw new UnsupportedOperationException();
    }
    public void displayFilmInfo(){
        throw new UnsupportedOperationException();
    }
}
