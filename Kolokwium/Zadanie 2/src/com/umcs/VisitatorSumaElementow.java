package com.umcs;

public class VisitatorSumaElementow implements Visitor{
    public VisitatorSumaElementow(){}


    @Override
    public double wizytujSumaElementow(CatalogComponent catalogComponent) {
        System.out.println("ilość plików lub katalogów:");
        return catalogComponent.sumujIlosc();

    }

    @Override
    public double wizytujSumaRozmiarow(CatalogComponent c) {
      return 0;
    }
}
