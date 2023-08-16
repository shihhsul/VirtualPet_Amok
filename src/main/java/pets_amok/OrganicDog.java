package pets_amok;
public class OrganicDog extends Organic {
    private int cageCleanliness;

    public OrganicDog(String name, String description) {
        super(name, description);
        this.cageCleanliness = 100;
    }

    public void cleanCage() {
        this.cageCleanliness = 100;
    }

    public int getCageCleanliness() {
        return this.cageCleanliness;
    }

    public void setCageCleanliness(int cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }

    @Override
    public void tick() {
        super.tick();
        this.cageCleanliness -= 10;
    }

    @Override
    public void oil() {
    }

    @Override
    public void walk() {
        thirst -=10;
    }

    @Override
    public int cleanLitterBox() {
        return 0;
    }

    @Override
    public void updateHealth() {
    }
}