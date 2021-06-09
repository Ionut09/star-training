package com.star.java.oop.streams.lambdas;

import com.star.java.oop.inheritance.Animal;

public class CheckSwim implements CheckAnimalTreat{

    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
