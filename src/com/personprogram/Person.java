package com.personprogram;
import java.time.LocalDate;
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
    String fullEGN;

    public Person(String name, String sex, String religion, String language, String job, String nationality, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.EGN = addEGN();
        this.dateOfBirth = generateDateOfBirth();
        this.age = generateAge();
        this.country = country;
    }

    /**
     * the method generates a user input EGN
     * @return String
     */
    public String addEGN(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your 10-digit EGN: ");
        String input = myInput.nextLine();
        if (input.chars().count() != 10){
            throw new InputMismatchException("Your digit should be exactly 10 digits. You've entered " + input.chars().count() + " digits.");
        }
        fullEGN = input;
        return input;
    }

    public String generateDateOfBirth() {
        String yearOfBirth = fullEGN.substring(0, 2);
        String monthOfBirth = fullEGN.substring(2, 4);
        String dayOfBirth = fullEGN.substring(4, 6);
        String dateOfBirth = dayOfBirth + "." + monthOfBirth + "." + yearOfBirth;
        System.out.println("The person date of birth is: " + dateOfBirth);
        return dateOfBirth;
    }

    public int generateAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        String yearOfBirth = fullEGN.substring(0, 2);
        int yearOfBirthInt = Integer.parseInt(yearOfBirth);
        int age = (currentYear - yearOfBirthInt) - 1900;
        System.out.println("Your age is: " + age);
        return age;
    }

    public boolean checkIfWrongSex(){
        try {
            if (sex != "male" && sex != "female") {
                System.out.println("The person's sex is a wrong value. Please provide a correct sex: male or female");
            }
            else System.out.println("The person's sex is: " + sex);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }

    private String sayHello() {
        String sayHelloInEnglish = null;
        try {
            String userLanguage = language;
            sayHelloInEnglish = "Hello";
            if (userLanguage == "Italian") {
                System.out.println("Ciao!");
            } else if (userLanguage == "Bulgarian") {
                System.out.println("Zdr ko pr!");
            } else if (userLanguage == "English")
                System.out.println(sayHelloInEnglish);
            else System.out.println("We don't support such a language option to say hello right now, buuuut...");
        } catch (Exception e) {
            System.out.println(e);
        }
        return sayHelloInEnglish;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Daniel", "male", "Christian", "Bulgarian", "Developer", "Bulgarian",  "Bulgaria");
        System.out.println(person1.checkIfWrongSex());
        System.out.println(person1.sayHello());
        //TODO wrong sex implementation to be added

        Person person2 = new Person("Pablo", "wrong", "Judaism", "Spanish", "Marketing expert", "Cuban", "Cuba");
        System.out.println(person2.checkIfWrongSex());
        System.out.println(person2.sayHello());

        Person person3 = new Person("Margaret", "female", "Islam", "Italian", "Pilot", "English", "Australia");
        System.out.println(person2.checkIfWrongSex());
        System.out.println(person2.sayHello());
    }


}
