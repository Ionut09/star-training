package com.star.java.oop.inheritance;

public class Horse extends Animal{

    private int tail;

    public Horse(int size, double weight, int tail) {
        super("Horse", size, weight);
        this.tail = tail;
    }
}
