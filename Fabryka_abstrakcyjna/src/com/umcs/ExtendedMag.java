package com.umcs;

public class ExtendedMag implements Magazynek {
    @Override
    public Magazynek makeMagazynek() {
        String name = "Powiększony magazynek";
        System.out.println("Dodaje: " + name);
        return new ExtendedMag();
    }
}
