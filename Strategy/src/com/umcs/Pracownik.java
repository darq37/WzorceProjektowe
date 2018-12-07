package com.umcs;

public class Pracownik { // klasa akontekstowa
    private StrategiaPracy strategiaPracy = null;
    private StrategiaWolnegoCzasu strategiaWolnegoCzasu = null;
    private StrategiaDojazdu strategiaDojazdu = null;

    public Pracownik(String zawod) { //  w zależności od zaowdu wybieram w konstruktorze odpowiednia strategie
        if (zawod.equalsIgnoreCase("mechanik")) {
            strategiaPracy = new NaprawiajAuta();
            strategiaDojazdu = new Samochodem();
            strategiaWolnegoCzasu = new Silownia();
        } else if (zawod.equalsIgnoreCase("lekarz")) {
            strategiaPracy = new LeczenieLudzi();
            strategiaDojazdu = new Samochodem();
            strategiaWolnegoCzasu = new Silownia();
        } else if (zawod.equalsIgnoreCase("listonosz")) {
            strategiaPracy = new RoznoszenieListow();
            strategiaDojazdu = new Rowerem();
            strategiaWolnegoCzasu = new Silownia();
        }

    }
    public void wywolujemyMetody(){
        strategiaPracy.pracuj();
        strategiaWolnegoCzasu.spedzajCzas();
        strategiaDojazdu.dojezdzaj();
    }

}
