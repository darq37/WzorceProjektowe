package com.umcs.podzespoly.kolba;

public class RegularStock implements Kolba {
    private String name = "regular stock";

    public RegularStock() {
        System.out.println("Dodaje " + this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
