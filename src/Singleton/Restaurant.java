package Singleton;

public class Restaurant {

    private static Restaurant burger;

    private Restaurant(){}

    public static Restaurant getBurger(){
        if(burger == null){
            burger = new Restaurant();
        }
        return burger;
    }

    public void burger(String burger){
        System.out.println(" "+ burger);
    }

}
