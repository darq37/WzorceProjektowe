package com.umcs;

public class AK47 extends AssaultRifle {
    private FabrykaPodzespolowAK fabrykaPodzespolowAK;
    AK47(FabrykaPodzespolowAK ak){
        fabrykaPodzespolowAK = ak;
        makingWeapon();
    }

    public void makingWeapon(){
        kolba = fabrykaPodzespolowAK.produkujKolbe().makeKolba();
        magazynek = fabrykaPodzespolowAK.produkujMagazynek().makeMagazynek();
        silencer =  fabrykaPodzespolowAK.produkujSilencer().makeSilencer();
        celownik = fabrykaPodzespolowAK.produkujCelownik().makeCelkownik();
    }
}