package com.methodslecture;

public class AverageNumExercise {

    static void findAverage(double a, double b, double c){
        double averageValue = a+b+c /3;
        System.out.println("The average value of " + a + ", " + b + ", " + " and " + c + " is: " + averageValue);
    }

    public static void main(String[] args) {
        findAverage(25, 1, 23);
    }
}
