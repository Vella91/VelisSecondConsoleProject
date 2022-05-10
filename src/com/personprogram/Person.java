package com.personprogram;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Objects;
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
            if (!Objects.equals(sex, "male") && (!Objects.equals(sex, "female"))) {
                System.out.println("The person's sex is a wrong value. Please provide a correct sex: male or female");
            } else System.out.println("The person's sex is: " + sex);
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

            if (userLanguage.equals("Italian")) {
                System.out.println("Ciao!");
            } else if (userLanguage.equals("Bulgarian")) {
                System.out.println("Zdr ko pr!");
            } else if (userLanguage.equals("English")) {
                System.out.println(sayHelloInEnglish);
            } else System.out.println("We don't support such a language option to say hello right now, buuuut...");
        } catch (Exception e) {
            System.out.println(e);
        }
        return sayHelloInEnglish;
    }

    public boolean checkIfCelebrateEaster() {
        if (religion.equals("Orthodox")) {
            boolean checkIfCelebrateEaster = true;
            System.out.println("The user celebrates Orthodox Easter.");
        } else if (religion.equals("Catholic")) {
            boolean checkIfCelebrateEaster = true;

            System.out.println("The user celebrates Catholica Easter");
        } else {
            boolean checkIfCelebrateEaster = false;
            System.out.println("The person does not celebrate Easter");
        }
        return false;
    }

    public boolean isAdult(int age) {
        boolean isAdult = false;
        if (age >= 18) {
            isAdult = true;
            System.out.println("User is Adult.");
        } else if (age >= 21 && nationality.equals("American")) {
            isAdult = true;
            System.out.println("User is Adult in America.");
        } else System.out.println("User is not an Adult.");
        return false;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Daniel", "male", "Orthodox", "Bulgarian", "Developer", "Bulgarian", "Bulgaria");
        System.out.println(person1.checkIfWrongSex());
        System.out.println(person1.sayHello());
        System.out.println(person1.checkIfCelebrateEaster());
        System.out.println(person1.checkIfCelebrateEaster());

        Person person2 = new Person("Pablo", "wrong", "Catholic", "Spanish", "Marketing expert", "Cuban", "Cuba");
        System.out.println(person2.checkIfWrongSex());
        System.out.println(person2.checkIfCelebrateEaster());
        System.out.println(person2.sayHello());
        System.out.println(person2.checkIfCelebrateEaster());


        Person person3 = new Person("Margaret", "female", "Islam", "Italian", "Pilot", "English", "Australia");
        System.out.println(person3.checkIfWrongSex());
        System.out.println(person3.sayHello());
        System.out.println(person3.checkIfCelebrateEaster());
        System.out.println(person3.checkIfCelebrateEaster());
    }
}
