package com.oopbasics;

public class MainShapes {
    public static void main(String[] args) {
        Circle s1 = new Circle();
        System.out.println(s1.getArea(4.5));
        System.out.println(s1);

        ShapeAbstraction s2 = new Circle(); //Upcast to Shape Abstraction
        System.out.println(s2.getArea(4.6));
        System.out.println(s2.getPerimeter(4.6));
        System.out.println(s2);

        Circle s3 = (Circle)s2; //downcast to Circle class
        System.out.println(s3); //s3 = s2 so they have the same address in the memory
        System.out.println(s2.getPerimeter(4.0));

        Square s5 = new Square();
        System.out.println(s5.getArea(5.0));
        System.out.println(s5.getPerimeter(5.0));
    }
}
