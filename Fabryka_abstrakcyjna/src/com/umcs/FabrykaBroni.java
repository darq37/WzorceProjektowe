package com.umcs;

public class FabrykaBroni {
    public AssaultRifle wydajBron(String model) {
        AssaultRifle assaultRifle = zlozBron(model);
        assaultRifle.pakowanieAmunicji();
        assaultRifle.probnyWystrzal();
        assaultRifle.sprzedaz();
        return assaultRifle;
    }


    private AssaultRifle zlozBron(String model) {
        AssaultRifle assaultRifle = null;
        if (model.equalsIgnoreCase("AK")) {
            assaultRifle = new AK47(new FabrykaPodzespolowAK());
        } else if (model.equalsIgnoreCase("M4")) {
            assaultRifle = new M4A1(new FabrykaPodzespolowM4());
        }
        return assaultRifle;

    }
}
