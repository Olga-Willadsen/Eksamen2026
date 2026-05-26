package Opgave_2;

import java.util.Scanner;

public class TextUI {

    static Scanner scan;





    public static String promptString(String msg){
        scan=new Scanner(System.in);
        System.out.println(msg);
        String input=scan.nextLine();

        return input;
    }




}
