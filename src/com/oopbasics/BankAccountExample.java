package com.oopbasics;

import java.util.Date;
import java.util.Random;

public class BankAccountExample {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    //fields are private then we use encapsulation, make the constructors and
    //include methods getter and setter which are also public with some logic in them
    public BankAccountExample(String name){
        this.ownerName = name;
        name = name.replace(" ", "");
        setAccountNumber(name);
    }

    BankAccountExample(String name, double transaction){
        this.accountBalance += transaction;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        if(this.ownerName == null)
            this.ownerName = ownerName;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    private void setAccountNumber(String name){
        Date d = new Date();
        Random r = new Random();
        this.accountNumber = name + d.getTime() + r.nextInt();
    }

    public void makeTransaction(double transaction){
        this.accountBalance += transaction;
    }


}
