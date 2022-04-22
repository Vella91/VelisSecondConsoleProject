package com.methodslecture;

public class Dog extends Animal {

    String breed;
    public Dog(String breed, String name){
        super();
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Im am a dog!");
    }

    public Dog(String name){
        super();
        this.name = name;
    }
}
