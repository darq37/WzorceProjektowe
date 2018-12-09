package com.umcs;

class Kierownik {
    private Builder builder; // oczywiscie, by wykorzystac metody klasy Builder, musimy stworzyc obiekt builder.

    public void setBuilder(Builder builder) {
        this.builder = builder; // tutaj setter dla obiektu
    }

    public Pracownik getPracownik() {
        return builder.getPracownik(); // tu builder dziala tak, ze wywolujemy metode getPracownik, która zwraca nam obiekt pracownik
        // typu Pracownik i przekazuje go do tej funkcji (Kierownik tez musi miec dostep do pracowników)
    }

    public void tworzPracownika() { // a tu juz kierownik ustala, które metody buildera są wykoprzystywane przy tworzeniu pracownika
        builder.makeWorker(); // metoda makeWorker tworzy nowy obiekt pracownika
        builder.dajImie(); // te metody dają mu konkretne dane
        builder.dajNazwisko();
        builder.dajPensje();
    }
}
