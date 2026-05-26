package Opgave_6;

public class Engine {

    private boolean running;

    Engine(boolean running){
        this.running=running;

    }

    public void start(){
        this.running=true;

    }

    public void stop(){
        this.running=false;
    }


    public boolean isRunning(){
        return running;
    }


}
