class A1{
    A1(int i){System.out.println("A");}
}

class B1{
    B1(int j){System.out.println("B");}
}

public class ex7 extends A1{
    B1 Bfield = new B1(1);
    ex7()
    {
        super(1);
    }
    public static void main(String args[])
    {
        ex7 ex7 = new ex7();
    }
}
