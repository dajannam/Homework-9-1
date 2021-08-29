package com.company;

public class Main {

    public static void main(String[] args) {
	Engine engine = new Engine();
	engine.setDisplacment(100);
	engine.setHorsepower(1000);

	Car car = new Car();
	car.setWeight(1000);
	car.setColor("blue");
	car.setEngine(engine);
	car.setPassangerCapacity(5);

	car.startEngine();
	car.openDoor();
		System.out.println(car);

	Truck truck = new Truck();
	truck.setColor("red");
	truck.setWeight(2999);
	truck.setEngine(engine);
	truck.setTowerCapacity(121);

	truck.startEngine();
	truck.openDoor();
		System.out.println(truck);

	Motorcycle motorcycle = new Motorcycle();
	motorcycle.setColor("green");
	motorcycle.setWeight(2000);
	motorcycle.setEngine(engine);
	motorcycle.setLanguage(false);

	motorcycle.startEngine();
	motorcycle.openDoor();
		System.out.println(motorcycle);

    }
}
