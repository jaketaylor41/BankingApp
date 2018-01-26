package com.company;

public class bankAccount {
    public String name;
    public String accountNumber;
    public double balance;


    public bankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }


    @Override
    public String toString(){
        return this.name + " " + "has" + " " + "$" + balance;

    }
}
