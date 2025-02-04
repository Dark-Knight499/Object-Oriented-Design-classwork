package games;
abstract public class Game
{
    String gameName;
    int turn  = 0;
    abstract public void play();
    abstract public void displayRules();
}
