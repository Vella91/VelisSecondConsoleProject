package com.methodslecture;

public class SmallestNumExercise {

    static void findSmallestNum(int a, int b, int c){
        if(a < b){
            if((a < c) && (a <b)){
                System.out.println("The smallest number is " + a);
            }
        }
        else if((b < c) && (b < a)){
            System.out.println("The smallest number is " + b);
        }
        else{
            System.out.println("The smallest number is " + c);
        }
    }

    public static void main(String[] args) {
        findSmallestNum(5, 3, 34);
    }
}
