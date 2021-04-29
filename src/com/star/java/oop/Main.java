package com.star.java.oop;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        //au valori default
        System.out.println(porsche.getDoors());//0
        System.out.println(porsche.getModel());//null

        porsche.setModel("Carrera");
//      porsche.setModel("1234567");
        System.out.println(porsche.getModel());
        porsche.setDoors(3);
        porsche.setColour("grey");
        System.out.println();
        System.out.println("Porsche : " + porsche.getColour() + "\n" + porsche.getModel() + "\n" + porsche.getDoors());

        //(String model, String colour, int doors, String fuel)
        Car bmw = new Car("Seria 3", "black", 5, "Diesel");
        System.out.println("BMW : " + bmw.getColour() + "\n" + bmw.getModel() + "\n" + bmw.getDoors());

    }
}
