package Opgave_2;

import java.util.ArrayList;

public class PhoneBook {

    ArrayList<Contact> allContacts= new ArrayList<>();


    PhoneBook(){
        setUpPhoneBook();
    }





    public void newContact (){

        String name=TextUI.promptString("Input first name");
        String number=TextUI.promptString("input phoneNumber");

        Contact a = new Contact(name, number);
        addContact(a);

        System.out.println("Your new contact:");
        System.out.println(a);

}


    public void addContact(Contact c){

        allContacts.add(c);
    }



    public Contact findByName (){
        String input= TextUI.promptString("Who are you looking for?");

        for(Contact c:allContacts){
            if (c.getName().equalsIgnoreCase(input)){
                System.out.println("Contact found! "+c.getName()+" telephone number: "+c.getNumber());
                return c;
            }
        }
        return null;
    }

    public void setUpPhoneBook(){

        allContacts.add(new Contact("Mette", "22458136"));
        allContacts.add(new Contact("Jonas", "51782394"));
        allContacts.add(new Contact("Sofie", "40126755"));
        allContacts.add(new Contact("Rasmus", "61943817"));
        allContacts.add(new Contact("Camilla", "28537409"));
        allContacts.add(new Contact("Frederik", "93274682"));
        allContacts.add(new Contact("Louise", "71601543"));
        allContacts.add(new Contact("Mikkel", "44893276"));
        allContacts.add(new Contact("Emma", "57319824"));
        allContacts.add(new Contact("Anders", "86432168"));

    }


}
