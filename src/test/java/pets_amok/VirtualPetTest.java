package pets_amok;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class VirtualPetTest {
    private VirtualPetShelter shelter;
    private VirtualPet pet1;
    private VirtualPet pet2;
    private VirtualPet pet3;

    
    @BeforeEach
    public void setUp() {
        shelter = new VirtualPetShelter();
        pet1 = new OrganicDog("Buddy", "A friendly dog");
        pet2 = new RoboticCat("Whiskers", "A playful cat");
        pet3 = new RoboticDog("Steven", "A playful dog");

    }

    @Test
    public void shouldOilAllRoboticPets() {
        
        shelter.intakePet(pet3);



        assertEquals(50, ((RoboticDog) pet3).getOilLevel());

        shelter.oilAllRoboticPets();



        assertEquals(60, ((RoboticDog) pet3).getOilLevel());
    }
    @Test
    public void shouldCleanDogCages() {
        shelter.intakePet(pet1);

        ((OrganicDog) pet1).setCageCleanliness(8);

        shelter.cleanDogCages();

      
        assertEquals(100, ((OrganicDog) pet1).getCageCleanliness());
    }

    @Test
    public void shouldCleanLitterBox() {
        shelter.intakePet(pet2);

   
        shelter.setLitterBoxCleanliness(6);

        shelter.cleanLitterBox();

  
        assertEquals(0, shelter.getLitterBoxCleanliness());
    }



}