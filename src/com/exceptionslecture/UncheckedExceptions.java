package com.exceptionslecture;

public class UncheckedExceptions {
    public static void main(String[] args) throws Exception {
        int[] myNum = {1,2,3,4};
        System.out.println(myNum[5]);
        //unchecked - we don;t need to handle them, will see the exception when we run the program
        //checked - will not compile if we don't handle them
    }
}
