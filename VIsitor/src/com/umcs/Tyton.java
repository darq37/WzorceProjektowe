package com.umcs;

public class Tyton implements Visitable {
    private double price;
    private String name;

    public String getName() {
        return name;
    }

    Tyton(double cena, String name) {
        this.price = cena;
        this.name = name;
    }

    double getPrice() {
        return price;
    }


    @Override
    public double accept(Visitor visitor) {
        return visitor.visitTyton(this);
    }
}
