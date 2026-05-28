package Opgave_1;

import java.text.DecimalFormat;

public class Account {

    private int id;
    private String owner;
    private double balance;

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

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

}
