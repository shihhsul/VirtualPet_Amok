package pets_amok;

public class OrganicCat extends VirtualPet {
    private int hunger;
    private int thirst;
    private int litterBoxCleanliness;

    public OrganicCat(String name, String description) {
        super(name, description);
        this.hunger = 50;
        this.thirst = 50;
        this.litterBoxCleanliness = 50;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getLitterBoxCleanliness() {
        return litterBoxCleanliness;
    }

    public void feed() {
        hunger -= 20;
    }

    public void water() {
        thirst -= 20;
    }

    public int cleanLitterBox() {
        litterBoxCleanliness += 20;
        return litterBoxCleanliness;
    }

    @Override
    public void tick() {
        hunger += 5;
        thirst += 5;
        litterBoxCleanliness -= 5;
        updateHealth();
    }

    @Override
    public void updateHealth() {
        if (hunger >= 80 || thirst >= 80 || litterBoxCleanliness <= 20) {
            decreaseHealth();
        } else {
            increaseHealth();
        }
    }

    @Override
    public void oil() {
        // Not applicable for OrganicCat
    }

    @Override
    public void walk() {
        // Not applicable for OrganicCat
    }
}