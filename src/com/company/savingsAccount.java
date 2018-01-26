package com.company;

public class savingsAccount extends bankAccount {

    public savingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public String toString(){
        return this.name + " " + "has" + " " + "$" + balance + " " + "in Savings Account";
    }
}
