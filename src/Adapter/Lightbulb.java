package Adapter;

public class Lightbulb {
    boolean powerOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        powerOn = true;
        this.voltage = voltage;
    }
    public void shutdown(){
        powerOn = false;
        voltage = 0;
    }

    public boolean isOn(){
        return powerOn;
    }
}
