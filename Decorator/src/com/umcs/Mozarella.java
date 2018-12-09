package com.umcs;

public class Mozarella extends ToppingDecorator {

    public Mozarella(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription(){
        return tempPizza.getDescription() + "Mozarella, ";
    }
    public double getCost(){
        return tempPizza.getCost() + 4;
    }
}
