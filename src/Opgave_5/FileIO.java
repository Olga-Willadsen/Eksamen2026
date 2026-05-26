package Opgave_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    Scanner fileReader;
    FileWriter fw;
    File messagesFile = new File("Data/opgave_5_messages.csv");

    public ArrayList<String> data (){
        ArrayList <String> data=new ArrayList<>();
        try{
        fileReader=new Scanner(messagesFile);
        String line;

        while(fileReader.hasNextLine()){
            line=fileReader.nextLine();
            data.add(line);
        }
        }catch (FileNotFoundException f){
            System.out.println("file not found");
        }
        return data;
    }


    public void saveMessage(String message, ArrayList<String>messages){
        try{
        fw = new FileWriter(messagesFile);
            for(String s:messages){
                fw.write(s+ "\n");
            }
        }catch (IOException i){
            System.out.println("file not found");
        }


        // message skal ind i bunden. gem den først i arraylisten
        // genmløb array og gem igen?
        // writer writer




    }



}
