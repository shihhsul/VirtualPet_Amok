package pets_amok;
import java.util.Objects;

public class OrganicDog extends VirtualPet {
    private int hunger;
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    private int thirst;
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    private int cageCleanliness;

    public void setCageCleanliness(int cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }

    public OrganicDog(String name, String description) {
        super(name, description);
        this.hunger = 50;
        this.thirst = 50;
        this.cageCleanliness = 0;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    public void feed() {
        hunger -= 20;
    }

    public void water() {
        thirst -= 20;
    }

    public void cleanCage() {
        cageCleanliness += 20;
    }

    
    @Override
    public void tick() {
        hunger += 5;
        thirst += 5;
        cageCleanliness -= 5;
        updateHealth();
    }

    @Override
    public void updateHealth() {
        if (hunger >= 80 || thirst >= 80 || cageCleanliness <= 20) {
            decreaseHealth();
        } else {
            increaseHealth();
        }
    }

    @Override
    public void oil() {
        // Not applicable for OrganicDog
    }

    @Override
    public void walk() {
        cageCleanliness += 10;
        increaseHappiness();
    }

    @Override
    public int cleanLitterBox() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cleanLitterBox'");
    }
}