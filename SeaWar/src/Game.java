import java.util.ArrayList;

public class Game {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pikabu.ru");
        DotCom two = new DotCom();
        two.setName("Ya.ru");
        DotCom three = new DotCom();
        three.setName("xnxx.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to kill 3 sites.");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Make your move: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "missed";
        for (DotCom dot : dotComList){
            result = dot.checkYourself(userGuess);
            if (result.equals("got it")){
                break;
            }
            if (result.equals("the end")){
                dotComList.remove(dot);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Game over");
        System.out.println(numOfGuesses + " - moves");
    }


    public static void main(String[] args){
        Game game = new Game();
        game.setUpGame();
        game.startPlaying();
    }
}
