package com.methodslecture;

public class Dog extends Animal {
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Im am a dog!");
    }

    private int age;
    private String dogName;
    public Dog(String name, int age){
        super(name);
        this.dogName = name;
        this.age = age;
    }

}