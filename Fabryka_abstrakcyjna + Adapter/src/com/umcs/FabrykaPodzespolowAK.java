package com.umcs;

import com.umcs.podzespoly.celownik.Celownik;
import com.umcs.podzespoly.kolba.Kolba;
import com.umcs.podzespoly.celownik.Acog;
import com.umcs.podzespoly.kolba.RegularStock;
import com.umcs.podzespoly.magazynek.Magazynek;
import com.umcs.podzespoly.silencer.Silencer;
import com.umcs.podzespoly.magazynek.QuickdrawMag;
import com.umcs.podzespoly.silencer.SoundSilencer;

public class FabrykaPodzespolowAK implements FabrykaDodatkow {
    @Override
    public Celownik produkujCelownik() {
        return new Acog();
    }

    @Override
    public Kolba produkujKolbe() {
        return new RegularStock();
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

