package com.oopbasics;

class PolymorphismAnimal {
    int maxAge = 14;

    public void animalSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Pig extends PolymorphismAnimal {
    int maxAge = 10;

    @Override
    public void animalSound() {
        super.animalSound();
    }
}

class Dog extends PolymorphismAnimal {
    @Override
    public void animalSound() {
        System.out.println("The dog says bow wow");
    }
}

