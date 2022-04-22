package com.methodslecture;


public class Examples {

    static void myMethod(String firstName, int Age){
        System.out.println("Hello " + firstName);
    }
    public static void main(String[] args) {
        myMethod("Cassie", 16);
        myMethod("Destiny", 25);
    }

    static int a = 5;
    void printName(){
        System.out.println("Your name is ....");
    }

    public static void myMethod(){
        System.out.println("Hello!");
    }

    Examples myExample = new Examples();
}
