import static Chapter7.Chapter7_lib.*;

class Game {
    Game(int i)
    {
        println("Game constructor");
    }
}

class BoardGame extends Game
{
    BoardGame(int i)
    {
        super(i);
        println("BoardGame constructor");
    }
}

public class ex6 extends BoardGame{
    ex6()
    {
        super(11);
        println("ex6 constructor");
    }
    public static void main(String args[])
    {

    }
}
