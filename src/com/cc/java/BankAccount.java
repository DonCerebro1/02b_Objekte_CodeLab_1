package com.cc.java;

public class BankAccount {
private int balance;

public BankAccount(int initialBalance) {
    this.balance = initialBalance;
}
  
public void checkBalance(){
    System.out.println("Ihr Kontostand lautet: " + balance + " Euro");
}

public void desposit(int amountToDesposit){
    balance = amountToDesposit + balance;
    System.out.println("Sie haben gerade: " + amountToDesposit + " Euro eingezahlt");
}

public int withDraw(int amountToWithDraw){
    balance = balance - amountToWithDraw;
    System.out.println("Sie haben gerade: " + amountToWithDraw  + " Euro abgehoben");
    return amountToWithDraw;
}

// int --> String
public String toString(){
    return "Der aktuelle Kontostand lautet: " + balance + " Euro";
}
    

}
    

