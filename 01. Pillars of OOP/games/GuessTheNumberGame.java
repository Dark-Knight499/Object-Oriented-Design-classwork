package games;

import java.util.Scanner;

public class GuessTheNumberGame extends Game
{
    public GuessTheNumberGame()
    {
        gameName = "Guess The Number";
        turn = 3;
    }
    @Override
    public void displayRules() {
        System.out.println("\n\n\nGuess the number between 1 and 100. The game will tell you if your guess is too high or too low.");
        System.out.println("Keep guessing until you find the correct number, and you win!\n\n\n");
    }
    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 10);
        while (turn > 0) {
            System.out.println("Enter your guess");
            int guess = scanner.nextInt();
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number");
                break;
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
            turn--;  
        }
        scanner.close();
    }

}
