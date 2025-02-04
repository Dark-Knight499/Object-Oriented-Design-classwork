package games;
import java.util.Scanner;
public class RussianRouletteGame extends Game
{
    public RussianRouletteGame()
    {
        gameName = "Russian Roulette";
        turn = 6;
    }
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