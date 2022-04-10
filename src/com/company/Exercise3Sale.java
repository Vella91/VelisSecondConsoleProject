package com.company;

import java.util.Scanner;

public class Exercise3Sale {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the price of a pair of socks? Please enter the price value per unit: ");
        double priceOfPairOfSocks = myScanner.nextDouble();

        System.out.println("How many pairs of socks do you want to buy? Please enter the amount value: ");
        int desiredQuantityToBuy = myScanner.nextInt();

        double revenueWhenSmallQuantityPurchased = (priceOfPairOfSocks * desiredQuantityToBuy);

        double discountOfSocksForMediumOrder = (priceOfPairOfSocks * 15) / 100;
        double finalPriceOfSocksForMediumOrder = priceOfPairOfSocks - discountOfSocksForMediumOrder;
        double revenueForMediumOrder = (finalPriceOfSocksForMediumOrder * desiredQuantityToBuy);
        double discountedAmountForMediumOrder = (priceOfPairOfSocks - finalPriceOfSocksForMediumOrder) * desiredQuantityToBuy;

        double discountOfSocksForLargeOrder = (priceOfPairOfSocks * 20) / 100;
        double finalPriceOfSocksForLargeOrder = priceOfPairOfSocks - discountOfSocksForLargeOrder;
        double revenueForLargeOrder = (finalPriceOfSocksForLargeOrder * desiredQuantityToBuy);
        double discountedAmountForLargeOrder = (priceOfPairOfSocks - finalPriceOfSocksForLargeOrder) * desiredQuantityToBuy;


        if (desiredQuantityToBuy < 100){
            System.out.println("The revenue from the order s: " + revenueWhenSmallQuantityPurchased);
            System.out.println("There is no Discount for an order of less than a 100 pairs of socks.");
        }
        else if (desiredQuantityToBuy <= 120){
            System.out.println("The revenue from the order is: " + revenueForMediumOrder);
            System.out.println("The order discount is: " + discountedAmountForMediumOrder);
        }
        else {
            System.out.println("The revenue from the order is: " + revenueForLargeOrder);
            System.out.println("The order discount is: " + discountedAmountForLargeOrder);
        }

    }
}
