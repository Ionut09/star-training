package com.star.java.oop.wrappers;

public class Examples {

    public static void main(String[] args) {
        //le folosim mereu in colectii
        //conversie String --> primitive type
        String s2 = "222";

        int parsedFromString = Integer.parseInt(s2);
        double d = Double.parseDouble("4.56");

        //conversie primitive type --> String
        String s = Integer.toString(3);
        s = s + "";
        s = String.valueOf(3);

        //contin limitele fiecarei primitive
//        Long.MAX_VALUE;
//        Long.MIN_VALUE;
//        Integer.min()
    }
}
