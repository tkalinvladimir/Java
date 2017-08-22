class Amphibian_2{
    public void test1(){System.out.println("Amphibean method \"test1()\"");}
    public void test2(){System.out.println("Amphibean method \"test2()\"");}
}

class Frog_2 extends Amphibian_2{
    public void test1(){System.out.println("Frog method \"test1()\"");}
    public void test2(){System.out.println("Frog method \"test2()\"");}
}

public class ex17 {
    public static void main(String[] args) {
        Frog_2 frog = new Frog_2();
        Amphibian_2 a = frog;
        a.test1();
        a.test2();
    }
}
