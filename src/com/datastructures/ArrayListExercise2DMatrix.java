package com.datastructures;

import java.util.Scanner;

public class ArrayListExercise2DMatrix {
    public static void main(String[] args) {

//        System.out.println("Enter the number of the table rows you want to store: ");
//        Scanner myScanner = new Scanner(System.in);
//        int rows = myScanner.nextInt();
//
//        System.out.println("Enter the number of columns for your table: ");
//        int columns = myScanner.nextInt();
//
//        System.out.println("Your table will have " + rows + " rows" + " and " + columns + " columns");
//
//        int howManyDigitsToEnter = rows * columns;
//        System.out.println("Enter the elements of the table which should be: " + howManyDigitsToEnter + " in total.");

        System.out.print("Enter 2D array size : ");
        Scanner myScanner = new Scanner(System.in);
        int rows=myScanner.nextInt();
        int columns=myScanner.nextInt();

        System.out.println("Enter array elements : ");
        int[][] userArray = new int[rows][columns];

        //so much hustle because I didn't put i and j into the scanner part in this block of code down below
        for (int i=0; i < rows; i++) {
            for (int j=0; j < columns; j++)
                userArray[i][j] = myScanner.nextInt();
        }

        System.out.println("\nData you entered: \n");
        for (int []x: userArray){
            for (int y:x){
                System.out.println(y+ "   ");
            }
            System.out.println();
        }
    }
}
