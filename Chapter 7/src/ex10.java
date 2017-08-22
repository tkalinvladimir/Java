
import static Chapter7.Chapter7_lib.*;

class Component_1
{
    Component_1(int i){println("Component1 constructor");}
}
class Component_2{
    Component_2(int i){println("Component2 constructor");}
}
class Component_3{
    Component_3(int i){println("Component3 constructor");}
}

class Root_v2
{
    Component_1 c1 = new Component_1(1);
    Component_2 c2 = new Component_2(2);
    Component_3 c3 = new Component_3(3);
}


public class ex10 extends Root_v2{
    Component_1 cs1 = new Component_1(4);
    Component_2 cs2 = new Component_2(5);
    Component_3 cs3 = new Component_3(6);
    public static void main(String args[])
    {
        ex10 ex10obj = new ex10();
    }
}
