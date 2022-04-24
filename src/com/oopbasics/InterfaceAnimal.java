package com.oopbasics;

interface InterfaceAnimal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

interface InterfaceNature {
    public void livingThing();
}

// Pig "implements" the Animal interface
class Cat implements InterfaceAnimal, InterfaceNature {
    public void animalSound() {
        // The body of animalSound() is provided here - overrides
        System.out.println("The cat says: meow");
    }

    public void sleep() {
        // The body of sleep() is provided here - overrides
        System.out.println("Zzz");
    }

    @Override
    public void livingThing() {
        System.out.println("The animal is a living thing.");
    }
}

class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();  // Create a Cat object
        myCat.animalSound();
        myCat.sleep();
        myCat.livingThing();
    }
}

