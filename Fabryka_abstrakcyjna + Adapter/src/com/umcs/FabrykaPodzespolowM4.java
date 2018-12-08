package com.umcs;

import com.umcs.podzespoly.celownik.Celownik;
import com.umcs.podzespoly.kolba.Kolba;
import com.umcs.podzespoly.celownik.AimPoint;
import com.umcs.podzespoly.kolba.TacticalStock;
import com.umcs.podzespoly.magazynek.ExtendedMag;
import com.umcs.podzespoly.magazynek.Magazynek;
import com.umcs.podzespoly.silencer.Silencer;
import com.umcs.podzespoly.silencer.FlashHider;

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
