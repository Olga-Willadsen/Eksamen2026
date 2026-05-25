package Opgave_3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    File file= new File ("Data/opgave_3_sales.csv");
    Scanner fileReader;
    String header;




    public ArrayList<String> dataString(){
        ArrayList <String> data= new ArrayList<>();
        String line;

        try{
            fileReader  = new Scanner(file);
            header=fileReader.nextLine();
            while(fileReader.hasNextLine()){
                line=fileReader.nextLine();
                data.add(line);
            }
        }catch (IOException i){
            System.out.println("stien er forkert");
        }
        return data;
    }








}
