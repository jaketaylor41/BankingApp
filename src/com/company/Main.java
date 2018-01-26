package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        checkingAccount checking = new checkingAccount("Jake", "1234", 0);
        savingsAccount savings = new savingsAccount("Jake", "5678", 0);


        checking.deposit(500);
        System.out.println(checking);

        savings.deposit(500);
        System.out.println(savings);

    }
}
