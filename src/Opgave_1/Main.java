package Opgave_1;


public class Main {

    static Bank bank = new Bank("Data/Opgave_1_accounts.csv");

    public static void main(String[] args){

        bank.printAllAccounts();

        System.out.println("---------------");

        bank.deposit(1, 500); //Jens får 500kr.

        bank.transfer(7,3, 5000.00); //overfører 5000 fra Inger til Helene

        bank.printAllAccounts();

        System.out.println("---------------");

        bank.withdraw(6, 1000); //vil ikke gå igennem

        bank.save();








}

}
