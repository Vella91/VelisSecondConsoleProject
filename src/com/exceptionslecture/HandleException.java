package com.exceptionslecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.println("Please enter one whole positive number: ");
            int myInt1 = myScanner.nextInt();
            System.out.println("Please enter another positive number: ");
            int myInt2 = myScanner.nextInt();

            if (myInt1 < 0 && myInt2 < 0) {
                throw new IllegalArgumentException("You didn't enter a positive number");
            }
            System.out.println(myInt1 / 0);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch - you didn't provide a number, the number is too large or it is not a whole number");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception message");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Here is your exception error: ");
    }
}
