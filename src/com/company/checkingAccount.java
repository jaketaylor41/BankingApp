package com.company;

public class checkingAccount extends bankAccount{

    int overDraftLimit = 0;

int overDraftCharge = 50;

    public void withdraw(double amount){
        if(balance - amount < 0){
            System.out.println("You have overdrawn your account.");
        } else {

        }
    }






    public checkingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public String toString(){
        return this.name + " " + "has" + " " + "$" + balance + " " + "in Checking Account";
    }
}
