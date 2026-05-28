package Opgave_4;

public class SmsNotifier implements Notifier{

    SmsNotifier(){}





    @Override
    public void send(String message) {

        if (message.length() < 160){
            System.out.println("\u001B[32m"+"Sending sms: "+"\u001B[0m"+message);
        } else {
            System.out.println("\u001B[32m"+"Sending shortened sms: "+"\u001B[0m"+message.subSequence(0, 160));
        }

    }



}

//maks 160 tegn