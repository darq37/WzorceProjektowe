package com.umcs;

public class Wyswietlacz {
    CatalogComponent catalogList;

    public Wyswietlacz(CatalogComponent newCatalogList){
        catalogList = newCatalogList;
    }
     public void getPlikList(){
        catalogList.displayPlikInfo();
    }
}
