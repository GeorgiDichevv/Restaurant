package Decorator;

public class SouceDecorator extends BurgerDecorator{

    private String souce;

    public SouceDecorator(BurgerDec soucedBurger, String souce){
        super(soucedBurger);
        this.souce = souce;
    }

    @Override
    public void create(){
        super.create();
        this.addSouce();
    }

    public void addSouce() {
        System.out.println(this.souce);
    }
}
