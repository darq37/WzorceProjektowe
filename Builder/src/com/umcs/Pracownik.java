package com.umcs;

public class Pracownik { /* Pierwsze to tworze sobie klasze pracownika, pracownikow bedzie 2, szef i frajer za 1500 zl, co pracuje*/
    private String name;
    private String surname;
    private int salary; // deklaruje 3 zmienne, imie, nazwisko no i pensje, zmienne są prywatne, nie mozemy ich zmienic sobie w main, od tego jest buiilder


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary; //by sie do nich dostac, uzywam publicznych setterów
    }

    public void showWorker(){
        if(name!=null) System.out.println("Imie: " + name);
        if(surname!=null) System.out.println("Nazwisko: " + surname);
        if(salary!=0) System.out.println("Pensja: " + salary);
        // pracownik oczywiscie musi sie jakos pokazac, wiec tu metoda tylko pokazujaca pracownika
    }


}
