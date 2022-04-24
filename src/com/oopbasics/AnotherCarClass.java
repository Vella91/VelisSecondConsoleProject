package com.oopbasics;

public class AnotherCarClass {
    String brand;
    int speed;
//getter and setter can be private - good practice - encapsulation
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
//constructor
    public AnotherCarClass(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

