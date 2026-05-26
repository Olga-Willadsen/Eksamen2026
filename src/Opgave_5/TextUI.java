package Opgave_5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TextUI {

    static Scanner scan;


    public static String promptText (String msg){
        String input=null;
        scan=new Scanner(System.in);

        System.out.println(msg);

        try{
            input=scan.nextLine();

        }catch (InputMismatchException i) {
            System.out.println("input mismatch");
            i.getMessage();
        }
        return input;
    }






}
