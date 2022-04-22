package com.exceptionslecture;

public class NestedExceptions {
    public static void throwit() {
        System.out.println("throwit");
        throw new RuntimeException();
    }

    public static void notThrowit(){
        throwit();
    }

    public static void main(String[] args) {
        try{
            System.out.println("hello");
            notThrowit();
        }
        catch (RuntimeException e){
            System.out.println("Caught");
            e.printStackTrace();
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("after");
    }
}
