package pets_amok;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class VirtualPetTest {
    private VirtualPetShelter shelter;
    private VirtualPet pet1;
    private VirtualPet pet2;

    
    @BeforeEach
    public void setUp() {
        shelter = new VirtualPetShelter();
        pet1 = new OrganicDog("Buddy", "A friendly dog");
        pet2 = new RoboticCat("Whiskers", "A playful cat");
        // Initialize more pets for your test cases
    }

    @Test
    public void shouldOilAllRoboticPets() {
        shelter.intakePet(pet1);
        shelter.intakePet(pet2);


        assertEquals(0, ((RoboticDog) pet1).getMaintenance());
        assertEquals(0, ((RoboticDog) pet2).getMaintenance());

        shelter.oilAllRoboticPets();


        assertEquals(5, ((RoboticDog) pet1).getMaintenance());
        assertEquals(5, ((RoboticDog) pet2).getMaintenance());
    }

    @Test
    public void shouldWalkAllDogs() {
        shelter.intakePet(pet1);


        assertEquals(0, ((OrganicDog) pet1).getCageCleanliness());

        shelter.walkAllDogs();


        assertEquals(10, ((OrganicDog) pet1).getCageCleanliness());
    }

    @Test
    public void shouldCleanDogCages() {
        shelter.intakePet(pet1);

        ((OrganicDog) pet1).setCageCleanliness(8);

        shelter.cleanDogCages();

      
        assertEquals(0, ((OrganicDog) pet1).getCageCleanliness());
    }

    @Test
    public void shouldCleanLitterBox() {
        shelter.intakePet(pet2);

   
        shelter.setLitterBoxCleanliness(6);

        shelter.cleanLitterBox();

  
        assertEquals(0, shelter.getLitterBoxCleanliness());
    }



}