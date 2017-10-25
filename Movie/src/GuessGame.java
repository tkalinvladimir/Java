public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int target = (int) (Math.random()*10);
        System.out.println("I count from 0 to 9");

        while (true){
            System.out.println("Number you have to guess is - "+target);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            System.out.println("p1 say it is "+guessp1);
            System.out.println("p2 say it is "+guessp2);
            System.out.println("p3 say it is "+guessp3);

            if (guessp1 == target){
                p1isRight = true;
            }
            if (guessp2 == target){
                p2isRight = true;
            }
            if (guessp3 == target){
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner");
                System.out.println("Winner is 1 player - " + p1isRight);
                System.out.println("Winner is 2 player - " + p2isRight);
                System.out.println("Winner is 3 player - " + p3isRight);
                System.out.println("The end");
                break;
            }
            else {
                System.out.println("One more turn");

            }

        }

    }

}

