package com.exceptionslecture;

public class CustomExceptionExample {
    public static void main(String[] args) throws MyException {
        throw new MyException();
    }

    static class MyException extends Exception {
        public MyException(String errorMessage) {
            super(errorMessage);
        }

        public MyException() {
            System.out.println("Default exception message");
        }
    }
}
