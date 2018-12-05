package com.umcs;

public class BossBuilder extends Builder {
    @Override
    public void dajImie() { // tu te 3 metody dajace mu dane
        pracownik.setName("Adam");
    }

    @Override
    public void dajNazwisko() {
        pracownik.setSurname("Małysz");
    }

    @Override
    public void dajPensje() {
        pracownik.setSalary(10000);
    }
}
