package com.umcs;

public class QuickdrawMag implements Magazynek {
    @Override
    public Magazynek makeMagazynek() {
        String name = "Szybki magazynek";
        System.out.println("Dodaje: " + name);
        return new QuickdrawMag();
    }
}
