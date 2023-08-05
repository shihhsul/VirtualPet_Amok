package pets_amok;

public class RoboticDog extends VirtualPet {
    private int maintenance;

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public RoboticDog(String name, String description) {
        super(name, description);
        this.maintenance = 0;
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
        // Not applicable for RoboticDog
    }

    @Override
    public void water() {
        // Not applicable for RoboticDog
    }



    @Override
    public void walk() {
        increaseHappiness();
    }

    @Override
    public int cleanLitterBox() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cleanLitterBox'");
    }
}
