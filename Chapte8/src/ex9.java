class Rodent{
    Rodent(){System.out.println("Rodent()");}
    void eat(){System.out.println("Rodent.eat()");}
    void run(){System.out.println("Rodent.run()");}
}

class Hamster extends Rodent{
    Hamster(){System.out.println("Hamster()");}
    @Override
    void eat(){System.out.println("Hamster.eat()");}
    @Override
    void run(){System.out.println("Hamster.run()");}
}

class Mouse extends Rodent{
    Mouse(){System.out.println("Mouse()");}
    @Override
    void eat(){System.out.println("Mouse.eat()");}
    @Override
    void run(){System.out.println("Mouse.run()");}
}

public class ex9 {
    public static void main(String[] args) {
        Rodent[] animals = {new Hamster(), new Hamster(), new Mouse()};

        for (Rodent animal:animals) {
            animal.eat();
            animal.run();
            System.out.println("==================");
        }
    }
}
