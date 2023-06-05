package Decorator;

public class BasicTelephone implements Telephone {
    @Override
    public void create(){
        System.out.println("I'm a Telephone. This are my main characteristics:");
        this.ihaveWhatsApp();
        this.ihaveTelegram();
    }

    private void ihaveWhatsApp(){
        System.out.println("--> I have WhatsApp");
    }

    private void ihaveTelegram(){
        System.out.println("--> I have Telegram");
    }
}
