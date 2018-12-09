package com.umcs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PolishTaxVisitor polishTaxVisitor = new PolishTaxVisitor();
        GermanTaxVisitor germanTaxVisitor = new GermanTaxVisitor();

        Inne produkt1 = new Inne(3.50, "jajka");
        Inne produkt2 = new Inne(2.50, "mleko");
        Inne produkt3 = new Inne(1.50, "woda");
        Alkohol produkt4 = new Alkohol(25.30, "Wyborowa");
        Tyton produkt5 = new Tyton(15.60, "Malboro");

        System.out.println(produkt1.accept(polishTaxVisitor) + "\n");
        System.out.println(produkt1.accept(germanTaxVisitor) + "\n");
        System.out.println(produkt2.accept(polishTaxVisitor) + "\n");
        System.out.println(produkt2.accept(germanTaxVisitor) + "\n");
        System.out.println(produkt3.accept(polishTaxVisitor) + "\n");
        System.out.println(produkt3.accept(germanTaxVisitor) + "\n");
        System.out.println(produkt4.accept(polishTaxVisitor) + "\n");
        System.out.println(produkt4.accept(germanTaxVisitor) + "\n");
        System.out.println(produkt5.accept(polishTaxVisitor) + "\n");
        System.out.println(produkt5.accept(germanTaxVisitor) + "\n");

    }
}
