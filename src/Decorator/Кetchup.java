package Decorator;

public class Кetchup implements BurgerDec{
    @Override
    public void create() {
        System.out.println("Добавя се кетчоп.");
    }
}
