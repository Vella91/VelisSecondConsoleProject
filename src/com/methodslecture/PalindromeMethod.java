package com.methodslecture;

public class PalindromeMethod {

    static int reverseDigits(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static boolean isPalindrom(int a1) {
        int a2 = reverseDigits(a1);
        if (a2 == a1) {
            return true;
            } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrom(566);
    }
}
