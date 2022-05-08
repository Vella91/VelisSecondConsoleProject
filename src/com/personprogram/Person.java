package com.personprogram;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private final String name;
    private final String sex;
    private final String religion;
    private final String language;
    private String job;
    private final String nationality;
    private final String EGN;
    private final String dateOfBirth;
    private int age;
    private final String country;

    public Person(String name, String sex, String religion, String language, String job, String nationality, String dateOfBirth, int age, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.EGN = addEGN();
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.country = country;
    }

    public String addEGN(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your 10-digit EGN: ");
        String input = myInput.nextLine();
        if (input.chars().count() != 10){
            throw new InputMismatchException("Your digit should be exactly 10 digits. You've entered " + input.chars().count() + " digits.");
        }
        return input;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Daniel", "male", "Christian", "Bulgarian", "Developer", "Bulgarian", "08.07.1990", 31, "Bulgaria");
        //TODO wrong sex implementation to be added

    }


}
