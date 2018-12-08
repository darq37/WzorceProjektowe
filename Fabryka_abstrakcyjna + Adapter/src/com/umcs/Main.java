package com.umcs;

import com.umcs.podzespoly.adapterBroni.AdapterBroniNaRzecz;
import com.umcs.podzespoly.adapterSloniNaRzecz.AdapterSloniNaRzecz;

public class Main {

    public static void main(String[] args) {
        FabrykaFabrykBroni fabrykaFabrykBroni = new FabrykaFabrykBroni();
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
/*
Tworze nowy obiekt fabryki broni,
Wywoluje metode wydaj Fabryke. Ta zwraca mi odpowiednią Fabrykę broni, w zależności od wybranego modelu.Nnastępnie na FabrycebroniAK wywoluje metode wydajBron.
Ta metoda wywoluje funkcje produkujące odpowiednie komponenty z fabryki dodatków, która jest przyjowana jako odpowiednia fabryka podzespołów do broni.
Z kolei każda metoda w fabryce broni tworzy mi odpowiedni obiekt (celownik, kolba itp) uzywając zdefiniowanego konstruktora, w którym tylko wypisuje się na ekran "Dodaje <obiekt>"
*/
}
