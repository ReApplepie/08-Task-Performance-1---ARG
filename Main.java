import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declare Scanner here
        GameStart gameStart = new GameStart();

        gameStart.displayMenu();
        int choice = scanner.nextInt();

        Game selectedGame = gameStart.selectGameMode(choice);
        gameStart.startGame(selectedGame);

        // Closing scanner after use
        scanner.close();  // Close it after using
    }
}
