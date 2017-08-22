class Amphibian{
    public void test1(){System.out.println("Amphibean method \"test1()\"");}
    public void test2(){System.out.println("Amphibean method \"test2()\"");}
}

class Frog extends Amphibian{
}

public class ex16 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian a = frog;
        a.test1();
        a.test2();
    }
}
