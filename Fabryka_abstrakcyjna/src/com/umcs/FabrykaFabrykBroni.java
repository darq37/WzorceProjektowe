package com.umcs;

public class FabrykaFabrykBroni {
    public FabrykaBroni wydajFabryke(String model) {
        if (model.equalsIgnoreCase("AK")) {
            return new FabrykaAK47();
        } else if (model.equalsIgnoreCase("M4")) {
            return new FabrykaM4A1();
        }
        return null;
    }
}
