package Command;

public class RoyalBurger implements OrderCommand {

    private Chef chef;

    public RoyalBurger(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.royalBurfer();
    }
}
