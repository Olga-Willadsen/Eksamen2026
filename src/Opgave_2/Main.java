package Opgave_2;

public class Main {

    static PhoneBook pb = new PhoneBook();


    public static void main(String[]args){


        pb.findByName();

        pb.newContact();

        System.out.println("all contacts in phonebook:");
        System.out.println(pb.getAllContacts());



    }
}
