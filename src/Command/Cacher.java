package Command;

public class Cacher {
    private OrderCommand orderCommand;

    public void takeOrder(String burgerSize, Chef chef){

        if(burgerSize.equals("кралски")){
            orderCommand = new RoyalBurger(chef);
        }
        if(burgerSize.equals("класически ")){
            orderCommand = new ClassicBurger(chef);
        }
        if(burgerSize.equals("вегетариански ")){
            orderCommand = new VegetarianBurger(chef);
        }
        else {
            System.out.println("Невалиден бургер.");
        }
        orderCommand.execute();
    }
}
