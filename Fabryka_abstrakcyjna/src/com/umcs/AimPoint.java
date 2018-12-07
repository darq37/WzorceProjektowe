package com.umcs;

public class AimPoint implements Celownik {
    @Override
    public Celownik makeCelkownik() {
        String name = "Aimpoint";
        System.out.println("Dodaje: " + name);
        return new AimPoint();
    }
}
