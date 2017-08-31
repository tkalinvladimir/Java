class Actor{
    public void act(){System.out.println("Act");}
}

class HappyActor extends Actor{
    public void act(){System.out.println("Happy actor");}
}

class SadActor extends Actor{
    public void act(){System.out.println("Sad actor");}
}

class Stage {
    private Actor actor = new HappyActor();
    public void change(){actor = new SadActor();}
    public void play(){actor.act();}
}

public class ex17_0 {
    public static void main(String[] args){
        Stage stage = new Stage();
        stage.play();
        stage.change();
        stage.play();
    }
}
