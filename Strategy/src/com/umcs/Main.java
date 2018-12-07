package com.umcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zawod: (lekarz, listonosz, mechanik)");
        String zawod = scanner.nextLine();


        try {
            Pracownik pracownik = new Pracownik(zawod);
            pracownik.wywolujemyMetody();
        } catch (Exception e) {
            System.out.println("Nie uwzględniony zawod");
        }
    }
}
