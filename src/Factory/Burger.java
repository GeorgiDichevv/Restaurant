package Factory;

public class Burger extends RestaurantFactory{
    @Override
    public RestaurantBurger createBurger(String burgerName) {
        if(burgerName.equals(ConstantsBurger.royalBurger)){
            return new RoyalBurger();
        }
        if (burgerName.equals(ConstantsBurger.classicBurger)) {
            return new ClassicBurger();
        }
        if(burgerName.equals(ConstantsBurger.vegetarianBurger)){
            return new VegetarianBurger();
        }
        else
        {
            System.out.println("Невалиден бургер.");
        }
        return null;
    }
}
