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

        //enhanced loop
        String[] carBrands = {"Audi", "BMW", "Mercedes"};
        for (String name : carBrands){
            System.out.println(name);
        }

        System.out.println("Now another enhanced loop with some Dog Breeds.");
        String[] dogBreeds = new String [4];
        dogBreeds[1] = "Pitbull";
        dogBreeds[2] = "German shephard";
        dogBreeds[0] = "Labrador";
        dogBreeds[3] = "Retriever";

        for (String dogBreed : dogBreeds){
            System.out.println(dogBreed);
        }

        System.out.println("enhanced for loop example from the web");
                int[] array = {1, 2, 3, 4, 5};

                for (int element: array) {
                    System.out.println(element);
                }
            }
        }


