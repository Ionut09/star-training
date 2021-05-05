package com.star.java.oop.inheritance;

public class Dog extends Animal { //is a -> Dog is an Animal

    private String name;

    private int tail;

    private String breed;

    public Dog(String name, int size, double weight, int tail, String breed) {
//      super();
        super("Dog", size, weight);
        this.tail = tail;
        this.breed = breed;
        this.name = name;
    }

//    asta este ce primim in mod default de la compilator
//    public Dog() {
//        super(); //merge ok daca nu extindem nicio clasa
//    }

    public Dog() {
        super("Dog", 50, 25); //merge ok daca nu extindem nicio clasa
    }

    @Override //metadata
    public void eat() {
        System.out.println("Dog: " + name + " eats");
        super.eat(); //Ctrl + B
        System.out.println("Dog: " + name + " eats again");

    }
}
