class Aaa {
    static { System.out.println("A loaded"); }
    Aaa() { System.out.println("A()"); }
}

class Bbb {
    static { System.out.println("B loaded"); }
    Bbb() { System.out.println("B()"); }
    static int i = 42;
}

public class ex23 {
    ex23() { System.out.println("App()"); }
    static { System.out.println("App loaded"); }
    static int j = 0;
    public static void main(String[] args) {
        System.out.println("main(String[])");
        ex23.j++;
        new ex23();
        new Aaa();
        Bbb.i = j;
    }
}
