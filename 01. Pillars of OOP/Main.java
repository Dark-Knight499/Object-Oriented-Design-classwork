import java.util.*;
import games.*;
class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the game you want to play");
        System.out.println("1)Guess the number");
        System.out.println("2)Russian Roulette");
        int choice = scanner.nextInt();
        Game game = null;
        switch (choice) {
            case 1:
                game = new GuessTheNumberGame();
                break;
            case 2:
                game = new RussianRouletteGame();
                break;
            default:
                System.out.println("Invalid input\nExiting the program");
                System.exit(0);
                break;
        }
        game.displayRules();
        game.play();
        scanner.close();
    }
}


