package com.umcs;

public class Main {

    public static void main(String[] args) {
        FabrykaBroni fabrykaBroni = new FabrykaBroni();
        System.out.println("AK47");
        AssaultRifle ak = fabrykaBroni.wydajBron("AK");
        System.out.println("M4A1");
        AssaultRifle m4 = fabrykaBroni.wydajBron("M4");
    }
}
