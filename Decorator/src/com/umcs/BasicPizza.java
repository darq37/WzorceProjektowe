package com.umcs;

public class BasicPizza implements Pizza {
    private static String name;

    @Override
    public String getDescription() {
        return "Składniki: ";
    }

    @Override
    public double getCost() {
        return 14.90;
    }
    static String getName() {
        return name;
    }

    public BasicPizza(String name){
        this.name = name;
    }
}
