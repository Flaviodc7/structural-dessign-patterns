package Decorator;

public class NextGenPhone extends DecoratorTelephone {
    public NextGenPhone(Telephone telephone){
        super(telephone);
    }

    @Override
    public void create(){
        super.create();
        System.out.println("--> I have 5G");
    }
}
