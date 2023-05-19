package Factory;

import Decorator.BurgerDec;

public class ClassicBurger extends RestaurantBurger implements BurgerDec {
    @Override
    public void prepare() {
        System.out.println("Приготвя се класически бургер.");
    }

    @Override
    public void create() {
        System.out.printf("Клсически бургер със " );
    }
}
