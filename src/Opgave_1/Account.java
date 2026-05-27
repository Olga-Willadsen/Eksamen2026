package Opgave_1;

import java.text.DecimalFormat;

public class Account {

    int id;
    String owner;
    double balance;

    Account (int id, String owner,double balance){
        this.id=id;
        this.owner=owner;
        this.balance=balance;
    }

    public void deposit (double amount){
        this.balance+=amount;
    }


    public void withdraw (double amount){
        if (balance > amount){
        balance-=amount;}
        else{
            System.out.println("Not enough money in account to withdraw. Your current balance: "+balance);
        }
    }
    public void setBalance(double amount){
        balance=amount;
    }

    public void modifyBalance(double amount){
        this.balance+=amount;
    }

    public double getBalance(){
        return balance;
    }

}
