package com.umcs;

public class M4A1 extends AssaultRifle {
    FabrykaPodzespolowM4 fabrykaPodzespolowM4;
    public M4A1(FabrykaPodzespolowM4 f){
        fabrykaPodzespolowM4 = f;
        makingWeapon();
    }

    public void makingWeapon(){
        kolba = fabrykaPodzespolowM4.produkujKolbe().makeKolba();
        magazynek = fabrykaPodzespolowM4.produkujMagazynek().makeMagazynek();
        silencer =  fabrykaPodzespolowM4.produkujSilencer().makeSilencer();
        celownik = fabrykaPodzespolowM4.produkujCelownik().makeCelkownik();
    }
}