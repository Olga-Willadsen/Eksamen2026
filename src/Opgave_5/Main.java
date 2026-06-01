package Opgave_5;

public class Main {

    private static MessageApp ma = new MessageApp("Data/opgave_5_messages.csv");
    private static View v = new View();

    public static void main (String [] args) {

    optionsLoop();

    }


        public static void optionsLoop() {
            String input="";
            while (!input.equals("x")) {
                input = v.menu();

                switch (input) {
                    case "1":
                        ma.printAllmessages();
                        break;
                    case "2":
                        ma.saveNewMessage("skriv ny besked");
                        break;
                }
            }
            System.out.println("exiting");
        }


}
