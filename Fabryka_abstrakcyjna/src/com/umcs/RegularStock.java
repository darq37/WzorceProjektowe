package com.umcs;

public class RegularStock implements Kolba {
    @Override
    public Kolba makeKolba() {
        String name = "Zwykła kolba";
        System.out.println("Dodaje: " + name);
        return new RegularStock();
    }
}
