package com.umcs;

public class CiastoCienkie extends ToppingDecorator {

    public CiastoCienkie(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription(){
        return tempPizza.getDescription() + "Cienkie Ciasto";
    }
    public double getCost(){
        return tempPizza.getCost() + 4;
    }
}