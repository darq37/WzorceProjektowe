package com.umcs;

import com.umcs.podzespoly.adapterBroni.AdapterBroniNaRzecz;
import com.umcs.podzespoly.adapterSloniNaRzecz.AdapterSloniNaRzecz;

public class Main {

    public static void main(String[] args) {
        FabrykaFabrykBroni fabrykaFabrykBroni = new FabrykaFabrykBroni();
        System.out.println("AK47");
        AssaultRifle ak = fabrykaFabrykBroni.wydajFabryke("AK").wydajBron();
        ak.sprawdz();
        ak.probnyStrzal();
        System.out.println("M4A1");
        AssaultRifle m4 = fabrykaFabrykBroni.wydajFabryke("M4").wydajBron();
        m4.sprawdz();
        m4.probnyStrzal();
        Slon slon =  new Slon("Dominik", 75);

        Schowek schowek = new Schowek();
        schowek.schowaj(new AdapterBroniNaRzecz(ak));
        schowek.schowaj(new AdapterBroniNaRzecz(m4));
        schowek.schowaj(new AdapterSloniNaRzecz(slon));
        schowek.listuj();
    }
}
