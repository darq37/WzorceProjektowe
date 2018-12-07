package com.umcs;

public class TacticalStock implements Kolba {
    @Override
    public Kolba makeKolba() {
        String name = "Taktyczna kolba";
        System.out.println("Dodaje: " + name);
        return new TacticalStock();
    }
}
