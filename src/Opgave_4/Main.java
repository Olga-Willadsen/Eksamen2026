package Opgave_4;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    static String msg1 = "Many of Java’s object-oriented features are motivated by problems with previous languages, and their implementations are influenced by this history. Some of these features are hard to explain when people aren’t familiar with the problems they solve.";
    static String msg2 = "Welcome to Disney World";
    static LinkedList<Notifier> notifiers = setUpList();

    public static void main(String[] args) {

        // System.out.println(test.length());

        notifyAll(notifiers, msg1);

        System.out.println("----------------");

        notifyAll(notifiers, msg2);




    }

    public static void notifyAll(LinkedList<Notifier>list, String message){

        for (Notifier n:list){
            n.send(message);
        }
    }

//    public static Notifier getRandom (LinkedList <Notifier> list){
//     Random r = new Random();
//
//     int random = r.nextInt(list.size());
//
//        return list.get(random);
//    }



    public static LinkedList<Notifier> setUpList() {

        LinkedList<Notifier> allNotifiers = new LinkedList<>();

        allNotifiers.add(new SmsNotifier());
        allNotifiers.add(new EmailNotifier("olga.willadsen@gmail.com"));
        allNotifiers.add(new SlackNotifier("StudyGroup EK"));

        return allNotifiers;
    }


}