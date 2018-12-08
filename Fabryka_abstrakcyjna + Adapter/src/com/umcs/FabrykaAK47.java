package com.umcs;

public class FabrykaAK47 implements FabrykaBroni {
    private FabrykaDodatkow akFactory = new FabrykaPodzespolowAK();

    @Override
    public AssaultRifle wydajBron() {
        return new AssaultRifle(
                "AK47",
                akFactory.produkujCelownik(),
                akFactory.produkujMagazynek(),
                akFactory.produkujKolbe(),
                akFactory.produkujSilencer()
        );
    }
}
