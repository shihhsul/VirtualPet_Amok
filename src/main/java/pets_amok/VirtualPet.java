package pets_amok;

public abstract class VirtualPet {
    private String name;
    private String description;
    private int hunger;
    private int thirst;

    private int waste;
    private int boredom;
    private int sickness;

    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        hunger = 50;
        thirst = 50;
        waste = 50;
        boredom = 50;
        sickness = 50;
    }
    public void feed(){
        hunger +=10;
        waste +=5;
    }
    public void water(){
        thirst +=10;
    }
    public void relieve(){
        waste -=20;
    }
    public void play(){
        boredom +=10;
    }
    public void visitDoctor(){
        sickness = 0;
    }
    public void tick() {
        hunger += 5;
        thirst += 5;
        waste += 5;
        boredom += 5;
        sickness += 5;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getWaste(){
        return waste;
    }
    public int getBoredom(){
        return boredom;
    }
    public int getSickness(){
        return sickness;
    }
        public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract void oil();
    public abstract void walk();
    public abstract int cleanLitterBox();
    public abstract void updateHealth();
}

