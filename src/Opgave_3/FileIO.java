package Opgave_3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    //File file= new File ("Data/opgave_3_sales.csv");
    static  Scanner fileReader;
    static String header;




    public static ArrayList<String> readFile(String url){
        File file = new File(url);
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
            System.out.println("noget gik galt");
            System.out.println(i.getMessage());
        }
        return data;
    }








}
