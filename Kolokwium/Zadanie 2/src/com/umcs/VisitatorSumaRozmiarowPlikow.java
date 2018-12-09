
package com.umcs;

public class VisitatorSumaRozmiarowPlikow implements Visitor {
     public VisitatorSumaRozmiarowPlikow(){}


    @Override
    public double wizytujSumaElementow(CatalogComponent catalogComponent) {
        return 0;
    }

    @Override
    public double wizytujSumaRozmiarow(CatalogComponent c) {
        return c.sumujRozmiar();
    }
}

