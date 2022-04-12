package com.datastructures;

import java.util.Arrays;

public class ArraysLectureExamples {
    public static void main(String[] args) {

        String[] cars = new String[3];
        cars[0] = "Mazzerati";
        cars[1] = "Alfa Romeo";
        cars[2] = "Bentli";

        System.out.println(cars[1]);
        Arrays.sort(cars);

        String[] carBrands = {"audi", "bmw", "mercedes"};
        for (String name : carBrands){
            System.out.println(name);
        }
    }
}
