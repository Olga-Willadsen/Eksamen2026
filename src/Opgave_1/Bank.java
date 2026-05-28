package Opgave_1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

public class Bank {

    private String url;
    private TreeMap <Integer, Account> allAccounts;


    Bank(String url){
        this.url=url;
        this.allAccounts=createAccounts();
    }



    public void transfer (int receiverId, int senderId, double amount) {
        Account reciever = null;
        Account sender= null;
        for (int id : allAccounts.keySet()) {

            if (id == receiverId) {
                reciever = allAccounts.get(id);
            } else if (id == senderId) {
                sender = allAccounts.get(id);
            }
        }
        if (reciever != null & sender != null) {
            reciever.deposit(amount);
            sender.withdraw(amount);
        } else System.out.println("transfer unsuccessful");
    }

//    public void transfer (Account reciever, Account sender, double amount){
//
//        if(sender.getBalance()>amount){
//            sender.withdraw(amount);
//            reciever.deposit(amount);
//        }else {
//            System.out.println("Not enough money in account to complete transaction");
//        }
//    }
//
//
//    public void withdraw(Account a, double amount){
//        if (a.getBalance()>amount){
//            a.withdraw(amount);
//        } else {
//            System.out.println("Not enough money in account to complete withdrawal");
//        }
//    }

    public void deposit(int accountId, double amount){

        for (int id: allAccounts.keySet()){
            Account a= allAccounts.get(id);
            if(id==accountId){
                a.deposit(amount);
            }
        }
    }

    public void withdraw (int accountId, double amount){
        for (int id: allAccounts.keySet()){
            Account a= allAccounts.get(id);
            if(id==accountId){
                a.withdraw(amount);
            }
        }

    }

    public void printAllAccounts(){

        for(int id:allAccounts.keySet()){
            Account a = allAccounts.get(id);
            System.out.println(id+" : "+a.getOwner()+" : "+a.getBalance());
        }
    }




    public TreeMap <Integer, Account> createAccounts(){
        allAccounts= new TreeMap<>();


        for (String s:FileIO.data(this.url)){
            String [] values=s.split(",");

            int id = Integer.parseInt(values[0].trim());
            String name=values[1].trim();
            double balance = Double.parseDouble(values[2].trim());

            allAccounts.put(id, new Account(id, name,balance));

        }

        return allAccounts;
    }

    public ArrayList <String> dataString(){
        String s;
        ArrayList <String> dataString=new ArrayList<>();

        for (int id:allAccounts.keySet()){
            Account a=allAccounts.get(id);

            s=id+", "+a.getOwner()+", "+a.getBalance();
            dataString.add(s);
        }
        return dataString;

    }

    public void save (){
        FileIO.saveData(dataString(), this.url);
    }

    public TreeMap <Integer, Account> getAllAccounts(){
        return allAccounts;
    }

}
