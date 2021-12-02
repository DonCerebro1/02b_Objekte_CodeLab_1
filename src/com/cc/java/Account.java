package com.cc.java;

public class Account {
    private String bankName;
    private int currentBalance;
    private int newBalance;

    
    public Account(int currentBalance, String bankName) {
        this.currentBalance = currentBalance;
        this.bankName = bankName;
    }

    public void getBankInformation(){
        System.out.println(bankName + ": der aktuelle Kontostand beträgt: " + currentBalance);

    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
        newBalance =  newBalance * currentBalance;
        System.out.println(bankName + ": Neuer Kontostand: " + newBalance);
    }

    

    

    

}
