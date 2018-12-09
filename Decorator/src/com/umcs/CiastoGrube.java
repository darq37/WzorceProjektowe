package com.umcs;

public class CiastoGrube extends ToppingDecorator {

    public CiastoGrube(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription(){
        return tempPizza.getDescription() + "Grube Ciasto";
    }
    public double getCost(){
        return tempPizza.getCost() + 4;
    }
}