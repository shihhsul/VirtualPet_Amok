package pets_amok;
public class OrganicCat extends Organic {
    private static int litterBoxCleanliness = 100;

    public OrganicCat(String name, String description) {
        super(name, description);
    }

    public int cleanLitterBox() {
        return OrganicCat.litterBoxCleanliness = 100;
    }

    @Override
    public void tick() {
        super.tick();
        OrganicCat.litterBoxCleanliness -= 5;
    }

    @Override
    public void oil() {
    }

    @Override
    public void walk() {
    }

    @Override
    public void updateHealth() {
    }
}