package com.cc.java;

import java.io.Console;

public class App {
    
    public static void main(String[] args) {
        Account bankAcc = new Account(10000, "Konto  ");
        Account bankAccTwo = new Account(10000, "Konto 2");
        Account bankAccThree = new Account(10000,"Konto 3");

        bankAcc.getBankInformation();
        bankAccTwo.getBankInformation();
        bankAccThree.getBankInformation();

        output("-----------------------------");

        bankAcc.setNewBalance(10000);
        bankAccTwo.setNewBalance(20000);
        bankAccThree.setNewBalance(100000);

        bankAcc.getBankInformation();
        bankAccTwo.getBankInformation();
        bankAccThree.getBankInformation();

        output("----------BankAccount-------------------");

        BankAccount acc = new BankAccount(10000);
        acc.checkBalance();
        acc.withDraw(5000);
        acc.checkBalance();
        acc.desposit(15000);
        acc.checkBalance();
        System.out.println(acc);


    }

    static void output(String outputStr){
        System.out.println(outputStr);
    }
}
