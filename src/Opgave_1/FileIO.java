package Opgave_1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    static Scanner scan;


public static ArrayList<String> data (String url) {
    File accounts = new File(url);
    ArrayList<String> data= new ArrayList<>();

    String line;

    try {
        scan = new Scanner(accounts);
        while (scan.hasNextLine()){
            line=scan.nextLine();
            data.add(line);
        }

    }catch(IOException i){
        System.out.println("file path wrong");
    }
    return data;
}


}
