package Opgave_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {

    Scanner scan = new Scanner(System.in);



    public int promptInt(String message){
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

