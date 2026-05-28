package Opgave_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {

    static Scanner scan = new Scanner(System.in);



    public static int promptInt(String message){
        int response=0;
        System.out.println(message);
        try {
            response = scan.nextInt();
        }catch (InputMismatchException i){
            System.out.println("input number");
            scan.nextLine();
            return promptInt(message);
        }
        return response;
    }


}

