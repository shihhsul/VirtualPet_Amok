package pets_amok;

public abstract class Robotic extends VirtualPet {
    protected int oilLevel;
    private int maintenance;

    public Robotic(String name, String description) {
        super(name,description);
        this.oilLevel = 50;
    }

    public void oil() {
        this.oilLevel += 10;
    }

    public int getMaintenance() {
        return this.maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int getOilLevel() {
        return this.oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }
}
