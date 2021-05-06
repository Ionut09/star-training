package com.star.java.oop.inheritance;

public class Zoo {
    public static void main(String[] args) {
//        Animal animal = new Animal("monster", 100, 200.20);
//        animal.eat();
//        animal.move();
        System.out.println();

        Dog spike = new Dog("Spike", 20, 30, 5, "buldog");
        spike.eat();
        spike.move();
        System.out.println();

        Animal dogAnimal = new Dog("Azorica", 15, 20, 10, "teckel");
        dogAnimal = new Horse(100, 500, 300);
        //tipul (clasa) referintei: Animal  -- metodele invocate trebuie sa existe in tipul referintei
        //tipul (clasa) obiectului: Dog
        //polimorfism
        dogAnimal.eat(); //compilatorul nu vede decat membrii care se gasesc in tipul referintei
        dogAnimal.move();

//      Dog dogTable = new Animal("monster", 100, 200.20);  nu se poate

    }

}
