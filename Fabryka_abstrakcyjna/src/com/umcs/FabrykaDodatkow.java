package com.umcs;

import com.umcs.podzespoly.celownik.Celownik;
import com.umcs.podzespoly.kolba.Kolba;
import com.umcs.podzespoly.magazynek.Magazynek;
import com.umcs.podzespoly.silencer.Silencer;

public interface FabrykaDodatkow {
    public Celownik produkujCelownik();
    public Kolba produkujKolbe();
    public Magazynek produkujMagazynek();
    public Silencer produkujSilencer();

}