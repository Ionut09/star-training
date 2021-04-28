package com.star.storage.oop.inheritance;

public class Dog extends Animal { //is a -> Dog is a Animal

    private int tail;

    private String breed;

    public Dog(int size, double weight, int tail, String breed) {
        super("Dog", size, weight);
        this.tail = tail;
        this.breed = breed;
    }

    //asta este ce primim in mod default de la compilator
    public Dog() {
        super("Dog", 50, 25); //merge ok daca nu extindem nicio clasa
    }
}
