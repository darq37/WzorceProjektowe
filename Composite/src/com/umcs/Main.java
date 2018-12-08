package com.umcs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FilmComponent komedie = new FilmGroup("Komedie", "Filmy komediowe, polecane dla rodzin z dziećmi:");
        FilmComponent komedieRomantyczne = new FilmGroup("Komedie romantyczne", " Debilne filmy dla kobiet:");
        FilmComponent horrory = new FilmGroup("Horrory", "Lepiej nie ogladać samemu:");
        FilmComponent filmyAkcji = new FilmGroup("Akcja", "Najlepsza akcja, tylko w kinie:");
        FilmComponent allMovies = new FilmGroup("Lista filmów", "Lista wszystkich filmów:");
        allMovies.add(komedie);
        allMovies.add(horrory);
        allMovies.add(komedieRomantyczne);
        komedie.add(new Film("Głupi i Głupszy", "Bobby Farrely", 1995));
        komedie.add(new Film("Głupi i Głupszy 2", "Troy Miller", 2003));

        komedie.add(komedieRomantyczne);

        komedieRomantyczne.add(new Film("Tylko mnie kochaj", "Ryszard Zatorski", 2006));
        komedieRomantyczne.add(new Film("Listy do M. 2","Maciej Dejczer", 2015));

        horrory.add(new Film("Smakosz", "Victor Salva", 2001));
        horrory.add(new Film("Smakosz 2", "Victor Salva", 2003));

        Repertuar cinemaCity = new Repertuar(allMovies);
        cinemaCity.getFilmList();
    }
}
