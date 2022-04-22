package com.methodslecture;

public class MathOperations {
    //it made me do it - private static int i  - why?
    private static int i = 0;

    static double addition(double[] numbers) {
        double sum = 0;
        for (; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
    int a = 5;

    private int bankAccountBalance = 3;

    public int getBankAccountBalance() {
        return bankAccountBalance;
    }

    public void setBankAccountBalance(int bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }
}
