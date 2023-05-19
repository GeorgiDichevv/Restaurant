package Decorator;

public abstract class BurgerDecorator implements BurgerDec{

    protected BurgerDec saucedBurger;

    public BurgerDecorator(BurgerDec saucedBurger){
        super();
        this.saucedBurger = saucedBurger;
    }
    @Override
    public void create() {
        this.saucedBurger.create();
    }
}
