package com.company;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        int k = 10;

        while (k>=1){
            System.out.println(k);
            k--;
        }

        int v = 0;
        do {
            System.out.println("V is: " + v);
            v--;
        }
        while (v >= 1);
    }
}
