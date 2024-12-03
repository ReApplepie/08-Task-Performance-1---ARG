import java.util.Scanner;

public class StoryMode implements Game {

    @Override
    public void start() {
        System.out.println("Welcome to the Apocalyptic Wasteland!\n");

        // Story introduction
        System.out.println("The world as you knew it has ended. A cataclysmic event, known as 'The Fall', has reduced most of civilization to ruins.");
        System.out.println("You and your best friend, Alex, are among the few survivors left, wandering the wasteland in search of food, water, and shelter.");
        System.out.println("It's been months since you last saw any other humans, and the world feels eerily silent, except for the howling winds and the occasional distant explosion.");

        System.out.println("\nAs you and Alex travel through a decimated city, you come across a partially destroyed convenience store. The door creaks open, and you hear a faint voice...");
        System.out.println("\n\"We have to take whatever we can. The storm's coming, and we need to find shelter. Now, let's make this quick.\" Alex says, looking over at you with concern in their eyes.");

        System.out.println("\nYou have a choice to make. Do you:");
        System.out.println("1. Enter the store cautiously, hoping to find food and supplies.");
        System.out.println("2. Ignore the store, feeling uneasy about the situation, and head to a nearby abandoned building instead.");

        // Decision point
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterStore(scanner);
                    break;
                case 2:
                    ignoreStore(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 or 2.");
            }
        }
    }

    @Override
    public void displayInstructions() {
        System.out.println("Story Mode: Surviving in an apocalyptic wasteland with your best friend. Make the right choices to stay alive and navigate the dangers ahead.");
    }

    // Choice 1: Enter the store
    private void enterStore(Scanner scanner) {
        System.out.println("\nYou and Alex step cautiously into the convenience store, scanning the shelves for anything useful.");
        System.out.println("Suddenly, a loud crash echoes from the back of the store, and you hear the unmistakable growl of a wild dog.");
        System.out.println("Alex looks at you, their hand resting on a broken broomstick, and says, \"We need to fight or run. We can't risk getting cornered.\"");

        System.out.println("\nDo you:");
        System.out.println("1. Grab a nearby canister and prepare to fight the wild dog.");
        System.out.println("2. Run out of the store and look for a better place to hide.");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                fightWildDog();
                break;
            case 2:
                runAndHide();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }

    // Choice 2: Ignore the store
    private void ignoreStore(Scanner scanner) {
        System.out.println("\nYou decide to ignore the store, feeling uneasy about entering.");
        System.out.println("You and Alex continue walking down the broken streets, the sound of the wind howling in the distance. You stumble upon an old school bus, offering some shelter from the storm.");
        System.out.println("But as you approach, you notice the faint outline of a group of raiders on the horizon. They're approaching fast.");

        System.out.println("\nDo you:");
        System.out.println("1. Hide inside the bus and hope they pass by.");
        System.out.println("2. Fight the raiders, knowing this could be your only chance to survive.");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hideInBus();
                break;
            case 2:
                fightRaiders();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }

    // Fight the wild dog
    private void fightWildDog() {
        System.out.println("\nYou grab a metal canister from a nearby shelf and prepare to defend yourself. Alex grabs the broken broomstick, ready to fight beside you.");
        System.out.println("The wild dog charges at you, teeth bared and growling fiercely.");
        System.out.println("With a quick swing of the canister, you hit the dog and send it running away, wounded but not dead.");
        System.out.println("Alex looks at you, breathing heavily, and says, \"That was close. But we survived. Let's get out of here before more danger comes.\"");
        System.out.println("You and Alex manage to gather some supplies from the store before leaving and head into the wasteland, ready for whatever comes next.");
        System.out.println("You've made it this far... but how long can you survive?");
    }

    // Run and hide from the wild dog
    private void runAndHide() {
        System.out.println("\nYou and Alex make a quick escape, running out of the store and down the street. You find a nearby alley to hide in.");
        System.out.println("The wild dog doesn't follow, but you're still on edge. The wasteland is full of dangers, and every step feels like it could be your last.");
        System.out.println("You both agree it's time to move on. The journey ahead is uncertain, but together, you're stronger than apart.");
    }

    // Hide in the bus
    private void hideInBus() {
        System.out.println("\nYou and Alex hide inside the old school bus, crouching low and praying the raiders don't notice you.");
        System.out.println("The raiders pass by, unaware of your presence. You both breathe a sigh of relief, but you know the danger isn't over.");
        System.out.println("You prepare to leave the bus and continue your journey, hoping for a safer place to hide from the next threat.");
    }

    // Fight the raiders
    private void fightRaiders() {
        System.out.println("\nYou and Alex decide to fight the raiders, knowing there's no other option.");
        System.out.println("The raiders outnumber you, but you're determined to survive. A battle ensues, and you fight fiercely with everything you've got.");
        System.out.println("In the end, you manage to drive the raiders off, but not without sustaining injuries. Alex is hurt, but alive.");
        System.out.println("Together, you limp away, grateful for survival, but aware that each victory in this wasteland comes at a cost.");
    }
}
