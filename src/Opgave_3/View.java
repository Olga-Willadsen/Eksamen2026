package Opgave_3;

import java.util.InputMismatchException;

public class View {
    TextUI ui = new TextUI();



    public int menu(){
        int response;
            response = ui.promptInt("""
                    Here are your options:
                    1. total sales
                    2. average sales
                    3. maximum sales
                    """);
             return response;
        }



}
