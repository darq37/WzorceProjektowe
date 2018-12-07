package com.umcs;

public class FlashHider implements Silencer {

    @Override
    public Silencer makeSilencer() {
        String name = "Tłumik płomienia";
        System.out.println("Dodaje: " + name);
        return new FlashHider();
    }
}
