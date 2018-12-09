package com.umcs;

public interface Visitor {
    double visitAlko(Alkohol alkoholItem);
    double visitTyton(Tyton tytonItem);
    double visitInne(Inne inneItem);
}
