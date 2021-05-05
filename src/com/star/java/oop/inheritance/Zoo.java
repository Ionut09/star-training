package com.star.java.oop.inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("monster", 100, 200.20);
        animal.eat();
        animal.move();

        Dog dog = new Dog("Spike", 20, 30, 5, "buldog");
        dog.eat();
        dog.move();
    }

}
