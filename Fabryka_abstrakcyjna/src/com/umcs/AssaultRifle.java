package com.umcs;

abstract class AssaultRifle {
    Celownik celownik;
    Magazynek magazynek;
    Kolba kolba;
    Silencer silencer;



    public abstract void makingWeapon();

    public void pakowanieAmunicji() {
        System.out.println("Pakuje amunicje...");
    }

    public void probnyWystrzal() {
        System.out.println("Strzelam na próbę...");
    }

    public void sprzedaz() {
        System.out.println("Sprzedaje karabin!");
    }
}


