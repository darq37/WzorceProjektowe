package com.umcs;

public abstract class CatalogComponent implements Wizyta{
    public void add(CatalogComponent newCatalogComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(CatalogComponent newCatalogComponent){
        throw new UnsupportedOperationException();
    }
    public CatalogComponent getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }
    public String getCatalogName(){
        throw new UnsupportedOperationException();
    }
    public int getSize(){
        throw new UnsupportedOperationException();
    }
    public void displayPlikInfo(){throw new UnsupportedOperationException();}
    public double wizytuj(Visitor visitor){throw new UnsupportedOperationException();}
    public int sumujIlosc(){throw new UnsupportedOperationException();}
    public int sumujRozmiar(){throw new UnsupportedOperationException();}

}
