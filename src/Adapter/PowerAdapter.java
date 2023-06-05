package Adapter;

public class PowerAdapter implements Plugged{
    public Lightbulb lightbulb = new Lightbulb();
    @Override
    public void turnOn(){
        lightbulb.turnOn(110);
    }
    @Override
    public void shutdown(){
        lightbulb.shutdown();
    }
    @Override
    public boolean isOn(){
        return lightbulb.isOn();
    }

}
