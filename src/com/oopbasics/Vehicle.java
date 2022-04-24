package com.oopbasics;

class Vehicle {
    String brand;
    String model;
    int years;

    Vehicle(String brand, String model, int years) {
        this.brand = brand;
        this.model = model;
        this.years = years;

        }
    protected void honk () {
        System.out.println("beep beep");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    Car(String brand, String model, int years, int numberOfDoors){
        super(brand, model, years);
        this.numberOfDoors = numberOfDoors;
    }

    private boolean isDoorClosed = true;

    public void closeOpenDoor(){
        this.isDoorClosed = !isDoorClosed;

        if (this.isDoorClosed){
            System.out.println("The door is closed");
        }
        else{
            System.out.println("The door is open");
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        Car c = new Car("Bently", "SomeModel", 10, 5);
        c.closeOpenDoor();
        c.honk();
    }
}