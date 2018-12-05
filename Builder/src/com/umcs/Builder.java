package com.umcs;

abstract class Builder {
    protected Pracownik pracownik; // jak budowac nowych pracownikow? tworzymy builder, który ma metody:

    public void makeWorker() {//makeWorker, która tworzy nowy obiekt Pracownika, czyli fizycznie konkretnego pracownika
        pracownik = new Pracownik();
    }

    public Pracownik getPracownik() { // no i metode getPracownik, która zwraca ten obiekt temu, kto tego żąda
        return pracownik;
    }

    public abstract void dajImie(); // by tworzyc pracownika, musimy nadać mu jakieś dane , stą 3 metody, dające mu te dane

    public abstract void dajNazwisko(); //każda metoda jest implementowana przez konkretny builder, tworzący konkretnych pracownikow

    public abstract void dajPensje();

}
