package com.company;

public class Exercise4MaxNumber {
    public static void main(String[] args) {

        double[] arr = {12, 14, 15, 12, 124, 1512, 2321, 12412, 1, 16, 23, 123, 3, 444};

        {
            double max = Double.NEGATIVE_INFINITY;

            for (double cur : arr)
                max = Math.max(max, cur);

            System.out.println("The max number is " + max);
        }
    }
}






