package com.umcs;

import java.text.DecimalFormat;

public class PolishTaxVisitor implements Visitor{

    PolishTaxVisitor(){}

    @Override
    public double visitAlko(Alkohol alkoholItem) {
        System.out.println("Produkt: " + alkoholItem.getName()+ " , cena bez podatku: " + alkoholItem.getPrice());
        System.out.println("Produkt: " + alkoholItem.getName()+ " , cena z podatkiem polskim: ");
        return alkoholItem.getPrice()*1.23;
    }

    @Override
    public double visitTyton(Tyton tytonItem) {
        System.out.println("Produkt: " + tytonItem.getName()+ " , cena bez podatku: " + tytonItem.getPrice());
        System.out.println("Produkt: " + tytonItem.getName()+ " , cena z podatkiem polskim: ");
        return tytonItem.getPrice()*1.23;

    }

    @Override
    public double visitInne(Inne inneItem) {
        System.out.println("Produkt: " + inneItem.getName()+ " , cena bez podatku: " + inneItem.getPrice());
        System.out.println("Produkt: " + inneItem.getName()+ " , cena z podatkiem polskim: ");
        return inneItem.getPrice()*1.18;

    }
}

