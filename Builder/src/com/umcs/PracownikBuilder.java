package com.umcs;

class PracownikBuilder extends Builder {
    @Override
    public void dajImie() { // tu te 3 metody dajace mu dane
        pracownik.setName("Jan");

    }

    @Override
    public void dajNazwisko() {
        pracownik.setSurname("Kowalski");
    }

    @Override
    public void dajPensje() {
        pracownik.setSalary(1500);
    }
}

