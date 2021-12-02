package com.cc.java;

import java.io.Console;

public class App {
    
    public static void main(String[] args) {
        Account bankAcc = new Account(10000, "Konto  ");
        Account bankAccTwo = new Account(10000, "Konto 2");
        Account bankAccThree = new Account(10000,"Konto 3");

        output("-----------Current Balance----------\n");

        bankAcc.getBankInformation();
        bankAccTwo.getBankInformation();
        bankAccThree.getBankInformation();

        output("\n-----------New Balance----------\n");

        bankAcc.setNewBalance(2);
        bankAccTwo.setNewBalance(3);
        bankAccThree.setNewBalance(10);

       

        output("\n----------BankAccount----------\n");

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
