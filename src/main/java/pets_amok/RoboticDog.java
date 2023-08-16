package pets_amok;

public class RoboticDog extends Robotic {
    public RoboticDog(String name, String description) {
        super(name,description);
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public void walk() {
    }

    @Override
    public int cleanLitterBox() {
        return 0;
    }

    @Override
    public void updateHealth() {
    }
}