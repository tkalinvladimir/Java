
import static Chapter7.Chapter7_lib.*;

class Component1
{
    Component1(){println("Component1 constructor");}
}
class Component2{
    Component2(){println("Component2 constructor");}
}
class Component3{
    Component3(){println("Component3 constructor");}
}

class Root
{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}


public class ex9 extends Root{
    Component1 cs1 = new Component1();
    Component2 cs2 = new Component2();
    Component3 cs3 = new Component3();
    public static void main(String args[])
    {
        ex9 ex9obj = new ex9();
    }
}
