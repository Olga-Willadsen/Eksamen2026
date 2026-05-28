package Opgave_2;

import java.util.Scanner;

public class TextUI {

    static Scanner scan;

    public static String promptString(String msg){
        String input=null;
        try {
            scan = new Scanner(System.in);
            System.out.println(msg);
            input = scan.nextLine();
        }catch (Exception e){
        }

        return input;
    }




}
