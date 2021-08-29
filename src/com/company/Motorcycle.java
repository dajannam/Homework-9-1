package com.company;

public class Motorcycle extends Vehicle {
    private boolean language;

    public Motorcycle(int weight, String color, Engine engine, boolean language) {
        super(weight, color, engine);
        this.language = language;
    }

    public Motorcycle() {
    }

    @Override
    public void startEngine() {
        System.out.println("Motorot na motorot e startuvan");

    }

    @Override
    public void openDoor() {
        System.out.println("Motorot nema vrata");
    }

    public boolean isLanguage() {
        return language;
    }

    public void setLanguage(boolean language) {
        this.language = language;
    }

    public String toString() {
        return "Tezina: " + getWeight() + "  Boja:  " + getColor();
    }
}
