import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate the random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        // Variable to store the user's guess
        int userGuess = 0;
        
        // Variable to keep track of the number of attempts
        int attempts = 0;
        
        // Game loop
        while (userGuess != numberToGuess) {
            // Prompt the user for their guess
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            // Check if the guess is correct, too high, or too low
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
