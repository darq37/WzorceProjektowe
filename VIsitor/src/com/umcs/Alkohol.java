package com.umcs;

public class Alkohol implements Visitable {
    private double price;
    private String name;


    public String getName() {
        return name;
    }

    Alkohol(double cena, String name) {
        this.price = cena;
        this.name = name;
    }
    double getPrice(){
        return price;
    }


    @Override
    public double accept(Visitor visitor) {
        return visitor.visitAlko(this);
    }
}
