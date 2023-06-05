package Decorator;

import Decorator.BasicTelephone;
import Decorator.NextGenPhone;
import Decorator.SmartPhone;

public class Main {
    public static void main(String[] args) {
        // BasicTelephone basicTelephone = new BasicTelephone();
        // basicTelephone.create();

        // SmartPhone smartPhone = new SmartPhone(new BasicTelephone());
        // smartPhone.create();

        NextGenPhone nextGenPhone = new NextGenPhone(new BasicTelephone());
        nextGenPhone.create();
    }
}