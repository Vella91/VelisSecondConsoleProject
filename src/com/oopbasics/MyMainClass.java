package com.oopbasics;

public class MyMainClass {
    public static void main(String[] args) {
        PolymorphismAnimal myAnimal = new PolymorphismAnimal();
        myAnimal.animalSound();

        Dog myDog = new Dog();
        myDog.animalSound();
        Pig myPig = new Pig();
        myPig.animalSound();
        System.out.println(myPig.maxAge);
        PolymorphismAnimal myPig2 = new Pig();
        System.out.println(myPig2.maxAge);
    }
}
