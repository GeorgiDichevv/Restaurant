package Command;

public class VegetarianBurger implements OrderCommand {
    private Chef chef;

    public VegetarianBurger(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.vegetarianBurger();
    }
}
