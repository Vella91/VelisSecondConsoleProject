package com.company;

import java.util.Scanner;

public class Exercise2UserAge {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int userAge = myScanner.nextInt();
        System.out.println("The employee's age is : " + userAge + ".");

        if(userAge >= 16){
            System.out.println("The employee is eligible to work.");
        }
        else {
            System.out.println("The employee is not eligibile for work.");
        }
    }
}
