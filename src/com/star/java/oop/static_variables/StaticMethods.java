package com.star.java.oop.static_variables;

public class StaticMethods {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printSum(5, 6);

        Calculator.printSum(5, 6);
        //metode si variabile ne-statice = de instanta
        //metode si variabile statice = de clasa
    }
}

class Calculator {
    private String operation;

    public static void printSum(int a, int b) {
//      System.out.println(operation);
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
