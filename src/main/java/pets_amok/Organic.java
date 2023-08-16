package pets_amok;

public abstract class Organic extends VirtualPet {
    protected int hunger;
    protected int thirst;

    public Organic(String name, String description) {
        super(name, description);
        this.hunger = 50;
        this.thirst = 50;
    }

    public void feed() {
        this.hunger -= 10;
    }

    public void water() {
        this.thirst -= 10;
    }
}