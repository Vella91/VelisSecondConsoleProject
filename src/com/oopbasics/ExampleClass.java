package com.oopbasics;

public class ExampleClass {

    static void printName(){
        System.out.println("This is printing a name");
    }

     public void printBrand(){
         System.out.println("This is printing a brand");
     };

    public static void main(String[] args) {
        //calling a static method in the main method
        printName();
        //calling a public method in the main method but only after an instance of the class to which it belongs is created
        ExampleClass myClass = new ExampleClass();
        myClass.printBrand();

    }
}
