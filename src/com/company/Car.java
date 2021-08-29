package com.company;

public class Car extends Vehicle{
    private int passangerCapacity;

    public Car(int weight, String color, Engine engine, int passangerCapacity) {
        super(weight, color, engine);
        this.passangerCapacity = passangerCapacity;
    }

    public Car() {
    }
    @Override
    public void startEngine(){
        System.out.println("Motorot na avtomobilot e startuvan");
    }
    @Override
    public void openDoor(){
        System.out.println("Vratata na avtomobilot e otvorena");
    }
    public int getPassangerCapacity(){
        return passangerCapacity;
    }
    public void setPassangerCapacity(int passangerCapacity){
        this.passangerCapacity = passangerCapacity;
    }

    public String toString(){
        return "Tezina: " + getWeight() + " Boja: " + getColor()  + "  Kolku patnici ima: " + getPassangerCapacity();
    }
}
