package Opgave_4;

public class EmailNotifier implements Notifier{

    private String recipient;

    EmailNotifier(String recipient){
        this.recipient=recipient;
    }


    @Override
    public void send(String message) {

        sendEmail(recipient);
        System.out.println("\u001B[32m"+"email body: "+"\u001B[0m"+message);
    }



    public void sendEmail (String recipient){
    System.out.println("\u001B[32m"+"sending email to:"+recipient+"\u001B[0m");
    }


}