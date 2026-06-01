package Opgave_6;

public class Car {

    private String model;
    private Engine engine;

    Car(String model, Engine engine){
        this.model=model;
        this.engine=engine;

    }

    public void start(){

        System.out.println("Before key is turned "+model+" is running?:"+engine.isRunning());
        engine.start();
        System.out.println(model + " is now running");
        }
        //System.out.println("after key is turned "+this.model+" "+engine.isRunning());


    public void stop(){
        System.out.println("Before key is turned "+model+" is running?:"+engine.isRunning());
        engine.stop();
        System.out.println(this.model + " is stopped");

        //System.out.println("after key is turned "+this.model+" "+engine.isRunning());

    }


}
