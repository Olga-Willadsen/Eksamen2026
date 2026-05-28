package Opgave_4;

public class SlackNotifier implements Notifier{

    private String channel;

    SlackNotifier(String channel){
        this.channel=channel;
    }

    @Override
    public void send(String message) {

        System.out.println("\u001B[32m"+"sending slack message: "+"\u001B[0m"+message+"\u001B[32m"+" to: "+channel+"\u001B[0m");

    }
}
