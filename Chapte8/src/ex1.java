// ex1 - ex5

class Cycle{
    public void move(){
        System.out.println("Cycle() ride");
    }
    public int wheels(){
        return 0;
    }
}

class Unicycle extends Cycle{
    public void move(){
        System.out.println("Unicycle() ride");
    }
    public int wheels(){
        return 1;
    }
}
class Bicycle extends Cycle{
    public void move(){
        System.out.println("Bicycle() ride");
    }
    public int wheels(){
        return 2;
    }
}
class Tricycle extends Cycle{
    //public void move(){
    //    System.out.println("Tricycle() ride");
   // }
    public int wheels(){
        return 3;
    }
}

public class ex1 {
    static void ride(Cycle c) {
        System.out.println("Wheels: "+ c.wheels());
        c.move();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);

    }
}
