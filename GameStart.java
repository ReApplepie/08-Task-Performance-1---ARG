
public class GameStart {

    // Display the main menu
    public void displayMenu() {
        System.out.println("Welcome to the Wasteland Survival Game!");
        System.out.println("Press 1 for Story Mode");
        System.out.println("Press 2 for Survival Mode");
    }

    // Select the game mode based on user input
    public Game selectGameMode(int choice) {
        Game game;
        switch(choice) {
            case 1:
                game = new StoryMode();
                System.out.println("You chose Story Mode!");
                break;
            case 2:
                game = new SurvivalMode();
                System.out.println("You chose Survival Mode!");
                break;
            default:
                game = new StoryMode();
                System.out.println("Invalid choice. Defaulting to Story Mode.");
                break;
        }
        return game;
    }

    // Start the game based on the selected mode
    public void startGame(Game game) {
        game.displayInstructions();
        game.start();
    }
}
