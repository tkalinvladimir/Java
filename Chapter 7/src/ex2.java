class Detergent
{
    public void soap(){System.out.println("Detergent soap");}
    public static void main(String args[])
    {
        System.out.println("main in Detergent");
    }
}

public class ex2 extends Detergent {
    public void soap(){System.out.println("ex2 soap"); super.soap();}
    public void clean(){System.out.println("ex2 clean");}
    public static void main(String args[])
    {
        ex2 obj = new ex2();
        obj.soap();
        obj.clean();
        Detergent.main(args);
    }
}
