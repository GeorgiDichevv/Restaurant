package Factory;

import Decorator.BurgerDec;

public class RoyalBurger extends RestaurantBurger implements BurgerDec {
    @Override
    public void prepare() {
        System.out.println("Приготвя се кралски бургер.");
    }

    @Override
    public void create() {
        System.out.printf("Кралски бургер със " );
    }
}
