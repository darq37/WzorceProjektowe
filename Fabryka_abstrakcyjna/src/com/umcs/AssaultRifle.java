package com.umcs;

import com.umcs.podzespoly.celownik.Celownik;
import com.umcs.podzespoly.kolba.Kolba;
import com.umcs.podzespoly.magazynek.Magazynek;
import com.umcs.podzespoly.silencer.Silencer;

public class AssaultRifle {
    private String nazwa;
    private Celownik celownik;
    private Magazynek magazynek;
    private Kolba kolba;
    private Silencer silencer;

    private AssaultRifle() {
    }

    public AssaultRifle(String nazwa, Celownik celownik, Magazynek magazynek, Kolba kolba, Silencer silencer) {
        this.nazwa = nazwa;
        this.celownik = celownik;
        this.magazynek = magazynek;
        this.kolba = kolba;
        this.silencer = silencer;
    }

    public void probnyStrzal() {
        System.out.println("Strzelam na próbę z" + this.nazwa);
    }

    public void sprawdz(){
        System.out.println("Sprawdzam: " + celownik + " ... OK!");
        System.out.println("Sprawdzam: " + magazynek + " ... OK!");
        System.out.println("Sprawdzam: " + kolba + " ... OK!");
        System.out.println("Sprawdzam: " + silencer + " ... OK!");
    }

    public String getNazwa() {
        return nazwa;
    }
}


