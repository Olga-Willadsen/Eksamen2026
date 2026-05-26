package Opgave_1;

public class Account {

    String owner;
    double balance;

    Account (String owner,double balance){
        this.owner=owner;
        this.balance=balance;
    }


    public void deposit (double amount){
        //indsæt på this.account
    }


    public void withdraw (double amount){
        //træk fra på this.account
    }

    public void transfer (Account receiver, double amount){
        //træk fra this.account, indsæt på receiver.setBalance
        //this.account.modifyBalance(-1*(amount)); ??
        //account.modifyBalance(amount);
        //hvordan bruger jeg samme metode til at trække fra og lægge til med samme amount?
    }

    public void setBalance(double amount){
        this.balance=amount;
    }

    public void modifyBalance(double amount){
        this.balance+=amount;
    }

}
