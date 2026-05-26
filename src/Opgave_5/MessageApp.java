package Opgave_5;

import java.util.ArrayList;

import static Opgave_5.TextUI.promptText;

public class MessageApp {

    String url;
    ArrayList <String> messages;

    MessageApp (String url){
        this.url=url;
        this.messages=FileIO.data(url);
    }




    public void printAllmessages(){
        for (String s:messages){
            System.out.println(s);
        }
    }


    public void saveNewMessage (String message){
        String newMessage=promptText(message);
        messages.add(newMessage);
        FileIO.save(url, messages);
    }



}
