package Adapter;

public class Lamp implements Plugged {
    boolean on = false;

    @Override
    public void turnOn() {
        on = true;
    }
    @Override
    public void shutdown(){
        on = false;
    }

    @Override
    public boolean isOn(){
        return on;
    }
}
