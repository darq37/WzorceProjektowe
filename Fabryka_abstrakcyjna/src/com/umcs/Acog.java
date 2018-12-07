package com.umcs;

public class Acog implements Celownik {
    @Override
    public Celownik makeCelkownik() {
        String name = "ACOG 4X";
        System.out.println("Dodaje: " + name);
        return new Acog();
    }
}
