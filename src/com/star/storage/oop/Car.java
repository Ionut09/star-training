package com.star.storage.oop;

public class Car extends Object { //in mod implicit

    //instance variables
    private String model;

    private String colour;

    private int doors;

    private String fuel;

    //are doar access modifer si nume=cu numele clasei
    public Car(String model, String colour, int doors, String fuel) {
        System.out.println("Constructor with parameters invoked");
        this.doors = doors;
        this.model = model;
        this.colour = colour;
        this.fuel = fuel;
    }

    public Car(){
        System.out.println("Empty constructor invoked");

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        String newModel = model.toLowerCase();
        //intotdeauna folosim equals pt comparatia obiectelor
        if (newModel.equals("carrera") || newModel.equals("panamera") || newModel.equals("taycan")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //bean naming convention
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
