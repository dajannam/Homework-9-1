package com.company;

public abstract class Vehicle {

    private int weight;
    private String color;
    private Engine engine;

    public Vehicle(int weight, String color, Engine engine) {
        this.weight = weight;
        this.color = color;
        this.engine = engine;
    }

    public Vehicle() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public abstract void startEngine();
    public abstract void openDoor();
}
