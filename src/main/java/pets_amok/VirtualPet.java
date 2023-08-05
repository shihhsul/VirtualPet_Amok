package pets_amok;

abstract class VirtualPet {
    private String name;
    private String description;
    private int hunger;
    private int thirst;

    private int waste;
    private int boredom;
    private int sickness;
    private int happiness;
    private int health;

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
    public abstract void tick();
    
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
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    public void setWaste(int waste) {
        this.waste = waste;
    }
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }
    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void increaseHappiness() {
        this.happiness +=10;
    }
    public void decreaseHealth() {
        this.health-=10;
    }
    public void increaseHealth() {
        this.health+=10;
    }
    public abstract void oil();
    public abstract void walk();
    public abstract int cleanLitterBox();
    public abstract void updateHealth();
}