package com.umcs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CatalogComponent korzen = new Catalog("Korzeń");
        CatalogComponent katalogA = new Catalog("A");
        CatalogComponent katalogB = new Catalog("B");

        korzen.add(katalogA);
        korzen.add(katalogB);
        katalogA.add(new Plik("1.txt", 100));
        katalogA.add(new Plik("2.txt", 150));
        katalogB.add(new Plik("a.xml", 300));
        katalogB.add(new Plik("b.xml", 120));
        katalogB.add(new Plik("c.xml", 120));

        Wyswietlacz wyswietlacz = new Wyswietlacz(korzen);
        wyswietlacz.getPlikList();
        VisitatorSumaRozmiarowPlikow v1=  new VisitatorSumaRozmiarowPlikow();
        VisitatorSumaElementow v2 = new VisitatorSumaElementow();
        korzen.wizytuj(v1);
        katalogA.wizytuj(v1);
        katalogB.wizytuj(v1);
        katalogA.wizytuj(v2);
        katalogB.wizytuj(v2);
        korzen.wizytuj(v2);

        System.out.println(korzen.wizytuj(v1));
        System.out.println(katalogB.wizytuj(v1));
        System.out.println(katalogA.wizytuj(v1));
        System.out.println(korzen.wizytuj(v2));
        System.out.println(katalogB.wizytuj(v2));
        System.out.println(katalogA.wizytuj(v2));
    }
}
