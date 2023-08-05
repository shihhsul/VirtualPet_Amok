package pets_amok;

public class RoboticCat extends VirtualPet {
    private int maintenance;

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public RoboticCat(String name, String description) {
        super(name, description);
        this.maintenance = 50;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void oil() {
        maintenance += 10;
        increaseHappiness();
    }

    @Override
    public void tick() {
        maintenance -= 5;
        updateHealth();
    }

    @Override
    public void updateHealth() {
        if (maintenance <= 20) {
            decreaseHealth();
        } else {
            increaseHealth();
        }
    }

    @Override
    public void feed() {
        // Not applicable for RoboticCat
    }

    @Override
    public void water() {
        // Not applicable for RoboticCat
    }

    @Override
    public int cleanLitterBox() {
        // Not applicable for RoboticCat
        return 0;
    }

    @Override
    public void walk() {
        // Not applicable for RoboticCat
    }
}
