package Decorator;

public class SmartPhone extends DecoratorTelephone{
    public SmartPhone(Telephone telephone){
        super(telephone);
    }

    @Override
    public void create(){
        super.create();
        System.out.println("--> I have 4G");
    }
}
