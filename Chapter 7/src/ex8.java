import static Chapter7.Chapter7_lib.*;

class Z
{
    Z(int i){
        println("Z constructor");
    }
}

public class ex8 extends Z{
    ex8()
    {
        super(0);
        println("ex8 base constructor");
    }
    ex8(int i)
    {
        super(i);
        println("ex8 new constructor");
    }

    public static void main(String args[])
    {
        new ex8();
        new ex8(0);

    }

}
