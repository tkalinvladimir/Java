class Engine{
    public void start(){};
    public void stop(){};
    public void rev(){};
    public void service() { System.out.println("service()"); }

}
class Wheel{
    public void inflate(int psi){};
}
class Window{
    public void rollup(){};
    public void rolldown(){};
}
class Door{
    public void open(){};
    public void close(){};
    public void rev(){};
}

// ну ваще это Car
public class ex14 {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door(); // купэ
    public ex14(){
        for (int i = 0; i<4; i++)
        {
            wheel[i]= new Wheel();
            wheel[i].inflate(2);
        }
    }
    public static void main(String[] args)
    {
        ex14 car = new ex14();
     car.engine.service();
        car.engine.start();
    }
}
