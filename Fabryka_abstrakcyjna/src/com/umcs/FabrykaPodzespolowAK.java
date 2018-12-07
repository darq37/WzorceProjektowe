package com.umcs;

public class FabrykaPodzespolowAK  implements FabrykaDodatkow{
    @Override
    public Celownik produkujCelownik() {

        return new Acog();
    }

    @Override
    public Kolba produkujKolbe() {
        return  new RegularStock();
    }

    @Override
    public Magazynek produkujMagazynek() {
        return new QuickdrawMag();
    }

    @Override
    public Silencer produkujSilencer() {
        return new SoundSilencer();
    }
}
