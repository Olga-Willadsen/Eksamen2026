package Opgave_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

   static Scanner fileReader;
   static FileWriter fw;


    public static ArrayList<String> data (String url){
        File file = new File(url);
        ArrayList <String> data=new ArrayList<>();
        try{
        fileReader=new Scanner(file);
        String line;

        while(fileReader.hasNextLine()){
            line=fileReader.nextLine();
            data.add(line);
        }
        }catch (Exception f){
            System.out.println("file not found");
        }
        return data;
    }


    public static void save(String url, ArrayList<String>messages) {
        try{
        fw = new FileWriter(url);
            for(String s:messages){
                fw.write(s+ "\n");
            }
        }catch (IOException i){
            System.out.println("file not found");
        } finally
        {try{fw.close();
        }catch (Exception e){
            e.getMessage();
        }

        }




        // message skal ind i bunden. gem den først i arraylisten
        // genmløb array og gem igen?
        // writer writer




    }



}
