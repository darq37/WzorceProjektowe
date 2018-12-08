package com.umcs.podzespoly.adapterBroni;

import com.umcs.AssaultRifle;
import com.umcs.Rzecz;

public class AdapterBroniNaRzecz implements Rzecz {
    private final AssaultRifle bron;

    public AdapterBroniNaRzecz(AssaultRifle bron) {
        this.bron = bron;
    }

    @Override
    public String getName() {
        return bron.getNazwa();
    }
}
