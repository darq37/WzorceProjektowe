package com.umcs.podzespoly.adapterSloniNaRzecz;

import com.umcs.Rzecz;
import com.umcs.Slon;

public class AdapterSloniNaRzecz implements Rzecz { // adapter implementuje to, na co ma adaptować
    private final Slon slon; //stała to tutaj obiekt słoń, to się nie zmienia,w końcu adapter słoni

    public AdapterSloniNaRzecz(Slon slon) { //konstruktor, biorący obiekt słonia i przypisuje go do slonia tutaj
        this.slon = slon;
    }

    @Override
    public String getName() { // wynik metody klasy do której adaptujemy to teraz wynik metody klasy z której adaptujemy
        return slon.getNazwa();
    }
}