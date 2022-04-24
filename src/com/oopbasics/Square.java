package com.oopbasics;

public class Square extends ShapeAbstraction {
    @Override
    Double getArea(double d) {
        System.out.println("Square area is: ");
        return (d * d);
    }

    @Override
    Double getPerimeter(double d) {
        System.out.println("Square perimeter is: ");
        return (4 * d);
    }
}

