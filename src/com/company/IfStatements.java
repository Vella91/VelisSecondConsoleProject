package com.company;

public class IfStatements {
     public static void main(String[] args) {

          int num1 = 43;

          if (num1 < 73)
          {
               System.out.println("Number is smaller than 73");

               if (num1 > 0) {
                    System.out.println("Number is  greater than 0");
               }
          }

          int num2 = 2345;

          if (num2 >= 1 && num2 < 10) {
               System.out.println("Number 2 is a SINGLE-digit number: " + num2);
          }
          else if (num2 >=10 && num2 < 100){
               System.out.println("Number 2 is a two-digit number: " + num2);
          }
          else if (num2 >= 100 && num2 < 1000) {
                    System.out.println("Number 2 is a three-digit number: " + num2);
          }
          else {
                    System.out.println("Number 2 is smaller than 1 or greater than 1000.");
          }
     }
}
