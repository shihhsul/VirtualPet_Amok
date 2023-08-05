package pets_amok;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new OrganicDog("Buddy", "A friendly dog");
        VirtualPet pet2 = new RoboticCat("Whiskers", "A playful cat");
        // Add more pets as needed

        shelter.intakePet(pet1);
        shelter.intakePet(pet2);

        System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");

        while (true) {
            displayPetsStatus(shelter);

            System.out.println("\nWhat would you like to do next?\n");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Oil all robotic pets");
            System.out.println("7. Walk all dogs");
            System.out.println("8. Clean dog cages");
            System.out.println("9. Clean the shelter litter box");
            System.out.println("10. Quit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                shelter.feedAllPets();
                break;
            case 2:
                shelter.waterAllPets();
                break;
            case 3:
                playWithPet(shelter, scanner);
                break;
            case 4:
                adoptPet(shelter, scanner);
                break;
            case 5:
                admitPet(shelter, scanner);
                break;
            case 6:
                shelter.oilAllRoboticPets();
                break;
            case 7:
                shelter.walkAllDogs();
                break;
            case 8:
                shelter.cleanDogCages();
                break;
            case 9:
                shelter.cleanLitterBox();
                break;
            case 10:
                System.out.println("Thank you for visiting the Virtual Pet Shelter!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
        }

        shelter.tick();
    }
    }

    private static void displayPetsStatus(VirtualPetShelter shelter) {
        System.out.println("\nThis is the status of your pets:\n");
        System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
        System.out.println("--------|-------|-------|-------");
        for (VirtualPet pet : shelter.getAllPets()) {
            System.out.println(pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getBoredom());
        }
    }
    
    private static void playWithPet(VirtualPetShelter shelter, Scanner scanner) {
        System.out.println("\nAvailable pets to play with:");
        for (VirtualPet pet : shelter.getAllPets()) {
            System.out.println(pet.getName());
        }

        System.out.print("Enter the name of the pet you want to play with: ");
        String petName = scanner.nextLine();

        VirtualPet petToPlayWith = shelter.getPet(petName);
        if (petToPlayWith != null) {
            shelter.playWithPet(petName);
        } else {
            System.out.println("No pet with that name found in the shelter!");
        }
    }

    private static void adoptPet(VirtualPetShelter shelter, Scanner scanner) {
        System.out.println("\nSure! Here are the pets available for adoption:\n");
        for (VirtualPet pet : shelter.getAllPets()) {
            System.out.println("[" + pet.getName() + "] " + pet.getDescription());
        }
        System.out.println("Which pet would you like to adopt?");
        String petName = scanner.nextLine();
        shelter.adoptPet(petName);
        System.out.println("\nCongratulations! You have adopted " + petName + ".");
    }

    private static void admitPet(VirtualPetShelter shelter, Scanner scanner) {
        System.out.println("\nWe appreciate your kindness. Please provide the pet's information:\n");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        VirtualPet newPet = new VirtualPet(name, description);
        shelter.intakePet(newPet);
        System.out.println("\nWelcome to the shelter, " + name + "!");
    }
    
}

