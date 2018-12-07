package com.umcs;

public class Samochodem implements StrategiaDojazdu {
    @Override
    public void dojezdzaj() {
        System.out.println("jedzie samochodem");
    }
}
