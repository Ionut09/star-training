package com.star.java.oop.streams.lambdas;

import com.star.java.oop.inheritance.Animal;

@FunctionalInterface //o adnotare marker
public interface CheckAnimalTreat {

    boolean test(Animal animal);

    default boolean testDefault(Animal animal) {
        return false;
    }

//    boolean test1(Animal animal);
}
