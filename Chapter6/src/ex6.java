public class ex6 {

    public static void main(String args[])
    {
        test1 t1 = new test1();
        t1.i = 1;
        t1.j = 2;
    }



}

class test1{
    protected int i=0; // в одном классе можно юзать протектед
    public int j=1;
    private int k=2;
}