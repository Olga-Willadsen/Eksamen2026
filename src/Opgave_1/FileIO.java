package Opgave_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    static Scanner scan;
    static FileWriter fw;


public static ArrayList<String> data (String url) {
    File file = new File(url);
    ArrayList<String> data= new ArrayList<>();

    String line;

    try {
        scan = new Scanner(file);
        while (scan.hasNextLine()){
            line=scan.nextLine();
            data.add(line);
        }

    }catch(IOException i){
        System.out.println("something went wrong while reading file");
    }
    return data;
}



public static void saveData (ArrayList<String> data, String url){

    try {
        fw = new FileWriter(url);
        for (String a : data) {
            if(a.equals(data.getLast()))
            {fw.write(a);}
            else {fw.write(a+ "\n");}
        }
    }catch(IOException io){
        System.out.println(io.getCause());
    }
    try{fw.close();
    }catch (Exception e){
        System.out.println("test");
    }
    }





}
