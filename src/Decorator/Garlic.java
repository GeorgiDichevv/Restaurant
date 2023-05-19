package Decorator;

public class Garlic implements BurgerDec{
    @Override
    public void create() {
        System.out.println("Добавяне на чеснов сос");
    }
}
