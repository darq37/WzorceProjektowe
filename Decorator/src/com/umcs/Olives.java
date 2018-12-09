package com.umcs;

public class Olives extends ToppingDecorator{

    public Olives(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription(){
        return tempPizza.getDescription() + "Oliwki, ";
    }
    public double getCost(){
        return tempPizza.getCost() + 4;
    }
}
