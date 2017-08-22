class A{
    A(){System.out.println("A");}
}

class B{
    B(){System.out.println("B");}
}

public class ex5 extends A{
    B Bfield = new B();
    public static void main(String args[])
    {
        ex5 ex5 = new ex5();
    }
}
