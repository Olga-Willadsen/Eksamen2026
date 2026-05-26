package Opgave_1;

import java.util.LinkedList;

public class Bank {

    String url;
    LinkedList<Account> allAccounts;


    Bank(String url){
        this.url=url;
        this.allAccounts=createAccounts();
    }





    public LinkedList <Account> createAccounts(){
        allAccounts= new LinkedList<>();


        for (String s:FileIO.data(this.url)){
            String [] values=s.split(",");

            String name=values[0];
            double balance = Double.parseDouble(values[1]);

            allAccounts.add(new Account(name,balance));

        }

        return allAccounts;
    }

}
