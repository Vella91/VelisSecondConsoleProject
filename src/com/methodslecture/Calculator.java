package com.methodslecture;

public class Calculator {
    public static void main(String[] args) {
        double[] numbers = {4.3, 5.6, 5};
        double sum = MathOperations.addition(numbers);
        System.out.println(sum);
        
        MathOperations myMath = new MathOperations();
        myMath.a = 6;
        System.out.println(myMath.a);

        MathOperations myMath2 = new MathOperations();
        System.out.println(myMath2.getBankAccountBalance());
    }
}
