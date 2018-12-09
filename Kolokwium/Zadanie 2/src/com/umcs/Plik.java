package com.umcs;

import java.util.ArrayList;

public class Plik extends CatalogComponent  implements Wizyta{
    private ArrayList pliki = new ArrayList<>();

    private String fileName;
    private int size;


    public String getFileName() {
        return fileName;
    }

    @Override
    public int getSize() {
        return size;
    }



    public Plik(String fileName,  int size) {
        this.fileName = fileName;
        this.size = size;
    }
    public void displayPlikInfo(){
        System.out.println("Plik: " + getFileName() + ",  Rozmiar: " + getSize());
    }

    @Override
    public double wizytuj(Visitor visitor) {
        return visitor.wizytujSumaRozmiarow(this);

    }
}
