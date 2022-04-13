package com.datastructures;

public class ArraysLargestNumberExercise {
    public static void main(String[] args) {

        int[] arr = {5,7,4,12,16,17,423};
        // System.out.println(arr[1]);
       // System.out.println(Arrays.toString(arr));
        int max = 0;

            for(int i = 0; i < arr.length; i++)
            {
                if(max < arr[i])
                {
                    max = arr[i];
                }
            }
            System.out.println("Maximum value in the array is:" + max);
        }
    }

