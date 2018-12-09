package com.umcs;

public class Ser extends ToppingDecorator {

    public Ser(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription(){
        return tempPizza.getDescription() + "Ser, ";
    }
    public double getCost(){
        return tempPizza.getCost() + 2;
    }
}