package com.star.java.oop.streams.lambdas;

import com.star.java.oop.inheritance.Animal;
import com.star.java.oop.inheritance.Fish;

public class Zoo {
    public static void main(String[] args) {
        CheckAnimalTreat checkTreat = new CheckSwim();
        Animal fish = new Fish();
        fish.setCanSwim(true);

        boolean canSwim = checkTreat.test(fish);
        System.out.println("canSwim = " + canSwim);

        CheckAnimalTreat checkTreatAnonymous =
                new CheckAnimalTreat() { //clasa anonima (implementeaza interfata si creaza un obiect din clasa care a implementat interfata) -> nu mai sunt folosite
                    @Override
                    public boolean test(Animal animal) {
                        return animal.canSwim();
                    }
                };

        canSwim = checkTreatAnonymous.test(fish);
        System.out.println("canSwim = " + canSwim);

        //LAMBDA
        CheckAnimalTreat checkTreatLambda = (Animal animal) -> {
            return animal.canSwim();
        }; //lambda (implementeaza interfata si creaza un obiect din clasa care a implementat interfata)
        canSwim = checkTreatLambda.test(fish);
        System.out.println("canSwim = " + canSwim);

        boolean canDoSOmethingDefault = checkTreatLambda.testDefault(fish);
        System.out.println("canDoSOmethingDefault = " + canDoSOmethingDefault);

        //varianta short
        checkTreatLambda = animal -> animal.canSwim(); //tipul parametrului este dedus automat de compilator
                                                        // printr-un mecanism numit type inference
        System.out.println("canSwim = " + checkTreatLambda.test(fish));

    }

}
