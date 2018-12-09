package com.umcs;

import java.util.ArrayList;

public class Catalog extends CatalogComponent implements Wizyta {



    private ArrayList katalogi = new ArrayList<>();

    private String catalogName;
    private int rozmiarSumaryczny;
    private int iloscSumarycznaKatalogów;

    public Catalog(String newCatalogName) {
        this.catalogName = newCatalogName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public int sumujRozmiar(){
        return rozmiarSumaryczny;
    }
    public int sumujIlosc(){
        return katalogi.size();
    }


    public void add(CatalogComponent newCatalogComponent) {
        katalogi.add(newCatalogComponent);
    }

    public void remove(CatalogComponent newCatalogComponent) {
        katalogi.remove(newCatalogComponent);
    }

    public CatalogComponent getComponent(int componentIdex) {
        return (CatalogComponent) katalogi.get(componentIdex);
    }

    public void displayPlikInfo() {
        System.out.println("\n" + getCatalogName());

        for (Object aKatalogi : katalogi) {
            CatalogComponent plikInfo = (CatalogComponent) aKatalogi;
            plikInfo.displayPlikInfo();
        }
    }


    @Override
    public double wizytuj(Visitor visitor) {
        return visitor.wizytujSumaElementow(this);

}
}
