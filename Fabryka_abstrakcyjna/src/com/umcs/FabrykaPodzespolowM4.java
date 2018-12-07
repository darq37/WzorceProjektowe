package com.umcs;

public class FabrykaPodzespolowM4 implements FabrykaDodatkow {
    @Override
    public Celownik produkujCelownik() {
        return new AimPoint();
    }

    @Override
    public Kolba produkujKolbe() {
        return new TacticalStock();
    }

    @Override
    public Magazynek produkujMagazynek() {
        return new ExtendedMag();
    }

    @Override
    public Silencer produkujSilencer() {
        return new FlashHider();
    }
}
