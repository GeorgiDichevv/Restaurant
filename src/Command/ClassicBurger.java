package Command;

public class ClassicBurger implements OrderCommand{
    private Chef chef;

    public ClassicBurger(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.classicBurger();
    }
}
