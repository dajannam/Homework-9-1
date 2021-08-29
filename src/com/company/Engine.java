package com.company;

public class Engine {

    private int displacment;
    private int horsepower;

    public Engine(int displacment, int horsepower) {
        this.displacment = displacment;
        this.horsepower = horsepower;
    }

    public Engine() {
    }

    public int getDisplacment() {
        return displacment;
    }

    public void setDisplacment(int displacment) {
        this.displacment = displacment;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
