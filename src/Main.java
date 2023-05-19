import Command.Cacher;
import Command.Chef;
import Decorator.BurgerDec;
import Decorator.Garlic;
import Decorator.SouceDecorator;
import Factory.*;
import Singleton.Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = Restaurant.getBurger();
        restaurant.burger("Бургер");

        Chef chef = new Chef();
        Cacher cacher = new Cacher();


        RestaurantFactory burgerFactory = new Burger();
        RestaurantBurger restaurantBurger = burgerFactory.produceBurger(ConstantsBurger.royalBurger);


        BurgerDec royalBurger = new RoyalBurger();
        royalBurger = new SouceDecorator(royalBurger,"чеснов сос" );
        royalBurger.create();


    }
}
