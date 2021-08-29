package com.company;

public class Truck extends Vehicle {
    private int towerCapacity;

    public Truck(int weight, String color, Engine engine, int towerCapacity) {
        super(weight, color, engine);
        this.towerCapacity = towerCapacity;
    }

    public Truck() {
    }

    @Override
    public void startEngine() {
        System.out.println("Motorot na kamionot e startuvan");
    }

    @Override
    public void openDoor() {
        System.out.println("Vratata na kamionot e otvorena");
    }

    public int getTowerCapacity() {
        return towerCapacity;
    }

    public void setTowerCapacity(int towerCapacity) {
        this.towerCapacity = towerCapacity;
    }

    public String toString() {
        return "Tezina: " + getWeight() + " Boja: " + getColor() + " Kapacitet: " + getTowerCapacity();
    }
}