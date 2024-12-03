import java.util.Random;
import java.util.Scanner;

public class SurvivalMode implements Game {

    private int health = 100;  // Starting health of the player
    private int water = 50;    // Starting water level
    private int food = 50;     // Starting food supply
    private boolean hasWeapon = false;  // Whether the player has a weapon
    private boolean hasShelter = false; // Whether the player has found shelter

    @Override
    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {  // Use try-with-resources for scanner
            System.out.println("Welcome to Survival Mode! You are alone in the wasteland, scavenging for supplies.");
            System.out.println("You must manage your health, water, and food while avoiding deadly dangers.");
            System.out.println("Survival is the key—how long can you last?");

            while (health > 0) {
                System.out.println("\nHealth: " + health + "% | Water: " + water + "% | Food: " + food + "%");
                System.out.println("What do you want to do?");
                System.out.println("1. Search for supplies");
                System.out.println("2. Look for shelter");
                System.out.println("3. Rest");
                System.out.println("4. Drink water");
                System.out.println("5. Eat food");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> searchForSupplies();
                    case 2 -> lookForShelter();
                    case 3 -> rest();
                    case 4 -> drinkWater();
                    case 5 -> eatFood();
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }

                // Check if survival is still possible
                if (water <= 0 || food <= 0) {
                    System.out.println("\nYou have run out of basic supplies and can't survive any longer...");
                    health = 0;
                }
            }

            System.out.println("Your health has reached zero. You did not survive the wasteland.");
            System.out.println("GAME OVER");
        }
    }

    @Override
    public void displayInstructions() {
        System.out.println("Survival Mode: Your goal is to survive in the wasteland as long as possible.");
        System.out.println("Manage your health, food, and water while scavenging for supplies, resting, or hiding from dangers.");
    }

    private void searchForSupplies() {
        Random rand = new Random();
        int result = rand.nextInt(3);

        switch (result) {
            case 0 -> {
                System.out.println("You found a stash of food and water!");
                food += 20;
                water += 20;
            }
            case 1 -> {
                System.out.println("You found a weapon! This might help defend yourself.");
                hasWeapon = true;
            }
            case 2 -> System.out.println("You found nothing useful... The wasteland is unforgiving.");
        }

        // Decrease water and food after every action
        water -= 5;
        food -= 5;
    }

    private void lookForShelter() {
        Random rand = new Random();
        int result = rand.nextInt(3);

        switch (result) {
            case 0 -> {
                System.out.println("You found a small abandoned shack! You can rest here and recover.");
                hasShelter = true;
                health += 10; // Recover health in shelter
            }
            case 1 -> {
                System.out.println("You wander for hours and find no shelter, the sun beating down on you.");
                health -= 10; // Lose health if no shelter found
            }
            case 2 -> {
                System.out.println("You find a cave, providing a little bit of shelter from the storm.");
                hasShelter = true;
            }
        }

        // Decrease water and food after every action
        water -= 5;
        food -= 5;
    }

    private void rest() {
        if (hasShelter) {
            System.out.println("You rest in the shelter, regaining some health.");
            health += 20;  // Rest and regain health
        } else {
            System.out.println("You try to rest, but there is no shelter. The harsh environment wears you down.");
            health -= 10;  // Lose health if there's no shelter to rest in
        }

        // Decrease water and food after every action
        water -= 5;
        food -= 5;
    }

    private void drinkWater() {
        if (water > 0) {
            System.out.println("You drink some water, feeling a bit better.");
            water -= 10;  // Drink water to stay hydrated
        } else {
            System.out.println("You have no water left! You're getting dangerously dehydrated.");
            health -= 10;  // Lose health if no water
        }
    }

    private void eatFood() {
        if (food > 0) {
            System.out.println("You eat some food, restoring a bit of energy.");
            food -= 10;  // Eat food to restore energy
        } else {
            System.out.println("You have no food left! You're starving.");
            health -= 10;  // Lose health if no food
        }
    }
}
