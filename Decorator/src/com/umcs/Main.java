package com.umcs;

public class Main {

    public static void main(String[] args) {
        Pizza pepperoni = new CiastoCienkie((new Pepperoni((new Ser(new BasicPizza("Pepperoni"))))));
        System.out.println("Składniki pizzy " + BasicPizza.getName() + ": "+ pepperoni.getDescription());
        System.out.println("Cena bazowej pizzy: " + pepperoni.getCost());

        Pizza bianca = new CiastoGrube(new Ser(new Ser(new Olives( new Mozarella(new BasicPizza("Bianca z podwójnyym serem"))))));
        System.out.println("Składniki pizzy " + BasicPizza.getName() + ": "+ bianca.getDescription());
        System.out.println("Cena bazowej pizzy: " + bianca.getCost());
    }
}
