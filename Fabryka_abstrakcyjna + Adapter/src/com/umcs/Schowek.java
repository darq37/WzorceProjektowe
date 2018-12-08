package com.umcs;

import java.util.LinkedList;
import java.util.List;

public class Schowek {
    private List<Rzecz> listaRzeczy = new LinkedList<>();
    public void schowaj(Rzecz rz) {
        System.out.println("Chowam rzecz: " + rz.getName());
        listaRzeczy.add(rz);
    }

    public void listuj() {
        System.out.println("Mam w schowku nastepujace rzeczy:");
        for (Rzecz r : listaRzeczy) {
            System.out.println(r.getName());
        }
    }
}
