package com.company;

public class ForLoops {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--)
            System.out.println("The value of i is: " + i);

        //array
        int[] myArray = {4,7,9,11};
        for(int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);

        //continue example
        for(int j = 0; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println("The value of j is: " + j);
        }

        //break example

        for(int l = 0; l <= 7; l++){
            System.out.println("The value of l is " + l);
            if (l == 5){
                break;
            }
        }
    }
}
