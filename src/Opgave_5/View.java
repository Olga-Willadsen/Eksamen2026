package Opgave_5;


public class View {


    public String menu(){

        String response= TextUI.promptText("""
                Choose from menu:
                1. print all messages
                2. write and save new message
                
                To exit press X
                """);

        return response;
    }




}
