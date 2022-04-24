package com.oopbasics;

abstract class AbstractionExample {
   public abstract void someSound();

   void whatSoundAmI(){
       System.out.println("the sound of the times.");
   }

    boolean niceSound = true;

    public boolean isNiceSound() {
        if (niceSound == true){
            System.out.println("it is a nice sound");
        }
        return true;
    }
}

class SomeSublcass extends AbstractionExample{
    public void someSound(){
        System.out.println("The sound of silence.");
    }
    public void whatSoundAmI(){
        super.whatSoundAmI();
    }
}

class Sounds {
    public static void main(String[] args) {
        SomeSublcass sb = new SomeSublcass();
        sb.whatSoundAmI();
        sb.someSound();
        sb.isNiceSound();
    }
}

