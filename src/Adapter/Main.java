package Adapter;

public class Main {
    public static void main(String []args){
        Oven oven = new Oven();
        Lamp lamp = new Lamp();
        PowerAdapter lightbulb = new PowerAdapter();

        turnOn(oven);
        turnOn(lamp);
        turnOn(lightbulb);
    }

    public static void turnOn(Plugged plugged){
        plugged.turnOn();
    }
    public static void shutdown(Plugged plugged){
        plugged.shutdown();
    }
    public static void isOn(Plugged plugged){
        plugged.isOn();
    }
}
