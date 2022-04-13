package com.datastructures;

import java.util.Scanner;

public class SumOfDiagonalsExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int i, j, row, column, sum = 0;

        System.out.println("Enter the number of rows: ");
        row = myScanner.nextInt();

        System.out.println("Enter the number of columns: ");
        column = myScanner.nextInt();

        //I have some error somewhere here
        System.out.println("Enter the Elements of the matrix");
        int[][] elements = new int[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                elements[i][j] = myScanner.nextInt();
            }
//            System.out.println("Elements of the matrix");
//            for (i = 0; i < row; i++) {
//                for (j = 0; j < column; j++) {
//                    System.out.print(elements[i][j] + "\t");
//                }
//                System.out.println("");
//            }

            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    if (i == j) //this condition checks for diagonal
                    {
                        sum = sum + elements[i][j];
                    }
                }
            }

            System.out.println("SUM of DIAGONAL elements of the matrix = " + sum);

        }
    }
}
