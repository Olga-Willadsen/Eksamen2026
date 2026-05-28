package Opgave_2;

public class Contact {

    private String name;
    private String phonenumber;

    Contact(String name, String phoneNumber){
        this.name=name;
        this.phonenumber=phoneNumber;

    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.phonenumber;
    }


    @Override
    public String toString() {
        return  "Contact{" +
                "name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
