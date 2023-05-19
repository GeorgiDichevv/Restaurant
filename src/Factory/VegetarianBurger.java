package Factory;

import Decorator.BurgerDec;

public class VegetarianBurger extends RestaurantBurger implements BurgerDec {
    @Override
    public void prepare() {
        System.out.println("Приготвя се вегетариански бургер.");
    }

    @Override
    public void create() {
        System.out.printf("Вегетариански бургер със " );
    }
}
