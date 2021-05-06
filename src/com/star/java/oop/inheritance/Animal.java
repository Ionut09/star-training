package com.star.java.oop.inheritance;

public abstract class Animal {

    private String species;

    private int size;

    private double weight;

    public Animal(String species, int size, double weight) {
        this.species = species;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void move() {
        System.out.println("Animal move");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
