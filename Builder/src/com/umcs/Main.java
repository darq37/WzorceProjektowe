package com.umcs;

public class Main {

    public static void main(String[] args) {
        Kierownik kierownik = new Kierownik(); // by uzyc metod Kieronika, oczywiscie także musi być stworzony obiekt kierownika
        Builder builderSzefa = new BossBuilder(); // Tworzymy teraz nowe obiekty poszczególnych builderów
        Builder builderFrajera = new PracownikBuilder();

        System.out.println("o to jest boss");
        kierownik.setBuilder(builderSzefa); // kierownik wykorzystuje metode Kierownika setBuilder, która ustala konkretny builder, w ty wypadku szefa ( dany jest obiekt typu Builder builderSzefa jako parametr)
        kierownik.tworzPracownika(); // uzywamy metody tworzPracownika, która tworzy nam faktycznie nowego pracownika
        Pracownik szefuniu = kierownik.getPracownik(); // tu sobie przypisujemy stworzonego pracownika do nowego obiektu
        szefuniu.showWorker(); // a tu tylko wypisujemy szefunia korzystająć z metody klasy Pracownik ( w końcy szefunio też pracuje, nie?)

        System.out.println("a to frajer");
        kierownik.setBuilder((builderFrajera));
        kierownik.tworzPracownika();
        Pracownik frajer = kierownik.getPracownik();
        frajer.showWorker(); // to samo dzieje się z biednym frajerem
    }
}
/*Podsumowując: By dobrze użyć wzorca projektowego Builder, musimy najpierw:
1. Stworzyc klase, która reprezentuje to, co chcemy budować i zawiera w sobie metody pozwalające na ustawienie odpowiednich wartosci przez buildery (settery)
oraz na wyswietlenie wszystkiego (pracownik.szowWorker())
2. Stworzyc Builder - klasę abstrakcyjną bądź interfejs, który będzie robił podstawowe rzeczy:
- tworzył obiekt klasy reprezentatywnej
- pozwalał na dostanie się do tego obiektu (getter)
- zawiera metody dające poszczególne dane - ich implementacja w poszczególnych builderach.
3. Stworzyc poszczególne buildery, implementujłące Builder, a w nich te metody z builder już dają konkretne Dane
4. Stworzyć Kierownika, który tworzy noiwy obiekt buildera, tak by można było użyć jego metod
- Kieroniwk musi miec metode ustalajacą którego buildera trzeba uzyc(tutaj setBuilder)
- musi mieć także metodę pozwalającą się dostać do obiektu pracownika, którą także ma Builder -  obiekt pracownik jest tutaj przekazywany do kierownika z Buildera
- no i oczywiscie kierownik musi takze mieć metode tworzącą onkretnego pracownika, swego rodzaju konstruktor, pokazujący, których metod uzywac ma Builder w tworzeniu pracownika. ( W klasie
BUilder ttylko te metody są zadeklarowane, używamy ich w klasie Kierownika na obiekcie buildera, który jest tu tworzony)
5. Następnie w Maine tworzymy konkretnego kierownika (obiekt Klasy Kierownik, który już może dostać się do stwoich metod
* */