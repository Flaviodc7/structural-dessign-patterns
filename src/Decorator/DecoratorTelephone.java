package Decorator;

public class DecoratorTelephone implements Telephone {
    private Telephone telephone;

    public DecoratorTelephone(Telephone telephone){
        this.telephone = telephone;
    }
    @Override
    public void create(){
        this.telephone.create();
    }
}
