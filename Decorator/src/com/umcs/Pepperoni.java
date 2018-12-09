package com.umcs;

public class Pepperoni extends ToppingDecorator{

    public Pepperoni(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription(){
        return tempPizza.getDescription() + "Pepperoni, ";
    }
    public double getCost(){
        return tempPizza.getCost() + 4;
    }
}
