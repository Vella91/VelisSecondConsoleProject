package com.methodslecture;

public class Main {
    public static void main(String[] args) {



        String myString = "123246214";
        int length = myString.length();

        System.out.println(length);

        if (length % 2 == 0){
            System.out.println(myString.charAt(length/2));
            System.out.println(myString.charAt((length/2) - 1));
        }
        else{
            System.out.println(myString.charAt(length/2));

        }
    }
}
