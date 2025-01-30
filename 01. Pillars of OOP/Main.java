import java.util.*;
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
                game = new GuessNumberGame();
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
abstract class Game
{
    String gameName = "No Name";
    int turn  = 0;
    abstract public void play();
    abstract public void displayRules();
}
class GuessNumberGame extends Game
{
    String gameName = "Guess The Number";
    int turn = 3;
    @Override
    public void displayRules() {
        System.out.println("\n\n\nGuess the number between 1 and 100. The game will tell you if your guess is too high or too low.");
        System.out.println("Keep guessing until you find the correct number, and you win!\n\n\n");
    }
    @Override
    public void play() {
    }

}
class RussianRouletteGame extends Game
{
    String gameName = "Russian Roulette";
    int turn = 6;

    @Override
    public void displayRules() {
        System.out.println("\n\n\nYou  spin the revolver, pulling the trigger, and hoping the chamber is empty.");
        System.out.println("if it is empty you get 10 pts and chance to continue or you can quit.\n\n\n");
    }

    @Override
    public void play() {
        @SuppressWarnings("resource")
        Scanner scanner = new  Scanner(System.in);
        int shootChance = (int)(Math.random() * 6) + 1;
        int points = 0;
        int inc = 10;
        while(turn>0)
        {
            System.out.println("To exit the game enter 0 and any other number to play");
            int choice = scanner.nextInt();
            if(choice==0) break;
            if(turn==shootChance)
            {
                System.out.println("Ohh no you lost!! :((");
                return ;
            }
            points +=inc;
            inc *=2;
            System.out.println("You survived!!! You can exit now to save!");
            System.out.println("Total Points : "+points+"\n multipler = "+inc/10);
            turn--;
        }
        System.out.println("YOU WON !!!\nTotal Points : "+points);
        scanner.close();
    }

}
// class Player
// {
//     int wallet ;
//     public static void deposit(){
//         Scanner scanner = new Scanner(System.in);
//     }
// }
