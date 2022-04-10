package com.company;

public class ForLoops {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--)
            System.out.println("The value of i is: " + i);

        int[] myArray = {4,7,9,11};
        for(int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }
}
