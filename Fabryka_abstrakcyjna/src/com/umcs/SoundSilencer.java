package com.umcs;

public class SoundSilencer implements Silencer {
    @Override
    public Silencer makeSilencer() {
        String name = "Tłumik dźwięku";
        System.out.println("Dodaje: " + name);
        return new SoundSilencer();
    }
}
