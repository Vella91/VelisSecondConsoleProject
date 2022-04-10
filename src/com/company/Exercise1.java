package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter value for angel A: ");
        int angleA = myScanner.nextInt();
        System.out.println("The value for angle A is: " + angleA);

        System.out.println("Enter value for angel B: ");
        int angleB = myScanner.nextInt();
        System.out.println("The value for angle B is: " + angleB);

        System.out.println("Enter value for angel C: ");
        int angleC = myScanner.nextInt();
        System.out.println("The value for angle C is: " + angleC);

        int sumOfAngles = (angleA + angleB + angleC);

        if (sumOfAngles != 180) {
            System.out.println("This is not a valid triangle");
        }

        if (angleA == 90 || angleB == 90 || angleC == 90) {
            if (sumOfAngles == 180 && angleA != 45 && angleB != 45) {
                System.out.println("The triangle has an angle of 90 degrees, so it is right-angled and multifaceted.");
            }
            if (sumOfAngles == 180 && (angleA == angleB) && (angleA == 45) || (angleC == 45)) {
                System.out.println("The triangle is right-angled and isosceles.");
            }
        }
        else if (angleA == 60 && angleB == 60 && angleC == 60) {
                System.out.println("The triangle has three equal angles of 60 degrees, so the triangle is equilateral.");
            }
        else if (sumOfAngles == 180 && ((angleA == angleB) || (angleA == angleC) || (angleC == angleB))) {
                System.out.println("The triangle has two equal angles, so the triangle is isosceles.");
            }
        else if ((angleA < 90) && (angleB < 90) && (angleC < 90) && (sumOfAngles == 180)) {
            System.out.println("The triangle is acute.");
        }
        else if (angleA > 90 || angleB > 90 && sumOfAngles == 180){
            System.out.println("The triangle is obtuse and possibly multifaceted.");
        }
        else if (sumOfAngles == 180 && angleA != 60 && angleA != angleB){
                System.out.println("The triangle is multifaceted.");
            }
        }
    }


