package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();
    private int litterBoxCleanliness;
    public void intakePet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public void adoptPet(String petName) {
        pets.remove(petName);
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    public void playWithPet(String petName) {
        VirtualPet pet = pets.get(petName);
        if (pet != null) {
            pet.play();
        }
    }
    public VirtualPet getPet(String petName) {
        return pets.get(petName);
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public VirtualPet getPetByName(String petName) {
        return pets.get(petName);
    }
    public void oilAllRoboticPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboticDog || pet instanceof RoboticCat) {
                pet.oil();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                pet.walk();
            }
        }
    }

    public void cleanDogCages() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }
        }
    }

    public void cleanLitterBox() {
        litterBoxCleanliness = 0;
    }

    public Map<String,VirtualPet> getPets() {
        return this.pets;
    }

    public void setPets(Map<String,VirtualPet> pets) {
        this.pets = pets;
    }

    public int getLitterBoxCleanliness() {
        return this.litterBoxCleanliness;
    }

    public void setLitterBoxCleanliness(int litterBoxCleanliness) {
        this.litterBoxCleanliness = litterBoxCleanliness;
    }

}
