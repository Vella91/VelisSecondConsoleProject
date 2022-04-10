package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What do you prefer: Mountain or Beach? Enter 1 for Mountain and 2 for Beach.");
        int vacationPreference = myScanner.nextInt();
        System.out.println("You prefer for a vacation is: " + vacationPreference);


        if (vacationPreference != 1 && vacationPreference != 2) {
            System.out.println("There is no such vacation preference right now.");
        } else {
            if (vacationPreference == 1) {
                System.out.println("You prefer the Mountain, so let's see how much is your budget per day per person.");
            } else System.out.println("You prefer the Beach, so let's see how much is your budget per day per person.");

            System.out.println("Please enter your allowed budget per day for one person for this vacation.");
            double allowedBudgetPerDayPerPerson = myScanner.nextInt();

            if (allowedBudgetPerDayPerPerson <= 0) {
                System.out.println("This is not a valid budget for this vacation. Please enter budget that is larger than 0.");
            }
            if (vacationPreference == 1 && allowedBudgetPerDayPerPerson >= 50) {
                System.out.println("I will advise that we look for your Mountain holiday somewhere outside of Bulgaria, for example Romania.");
            } else if (vacationPreference == 1) {
                System.out.println("I will advise that we look for your Mountain holiday somewhere nice in Bulgaria, for example the Pirin mountain.");
            } else if (allowedBudgetPerDayPerPerson >= 50) {
                System.out.println("I will advise that we look for your Beach Holiday somewhere abroad, for example Greece.");
            } else
                System.out.println("Let's look for some nice Beach destinations in Bulgaria, for example Sinemorets.");
        }
    }
}
