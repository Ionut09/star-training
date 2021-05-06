package com.star.java.oop.static_variables;

public class StaticVariables {

    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty");
        Cat fluffy = new Cat("Fluffy");

        Cat.name = "Jerry";

        System.out.println(kitty.name);
        System.out.println(fluffy.name);
        System.out.println(Cat.name);// asa se recomanda sa fie referentiate variabilele statice
    }
}

class Cat {
    //are aceeasi valoare pentru toate obiectele din clasa
    static String name;

    public Cat(String name) {
        this.name = name;
    }
}