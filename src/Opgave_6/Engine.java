package Opgave_6;

public class Engine {

    private boolean running;

    Engine(){
        running=false;

    }

    public void start(){
        if(running){
            throw new IllegalStateException("Engine already running");
        }
        running=true;

    }

    public void stop(){
        if(!running){
            throw new IllegalStateException("engine already stopped");
        }
        running=false;
    }


    public boolean isRunning(){
        return running;
    }


}
