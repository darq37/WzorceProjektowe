package com.umcs;

public class FabrykaM4A1 implements FabrykaBroni {
    private FabrykaDodatkow m4Factory = new FabrykaPodzespolowM4();

    @Override
    public AssaultRifle wydajBron() {
        return new AssaultRifle(
                "M4A1",
                m4Factory.produkujCelownik(),
                m4Factory.produkujMagazynek(),
                m4Factory.produkujKolbe(),
                m4Factory.produkujSilencer()
        );
    }
}
