// dispose снизу вверх
import static Chapter7.Chapter7_lib.*;

class Component__1
{
    Component__1(){println("Component1 constructor");}
    void dispose(){println("Component1 dispose");}
}
class Component__2{
    Component__2(){println("Component2 constructor");}
    void dispose(){println("Component2 dispose");}

}
class Component__3{
    Component__3(){println("Component3 constructor");}
    void dispose(){println("Component3 dispose");}

}

class Root__ex12 {
    Component__1 c1;
    Component__2 c2;
    Component__3 c3;
    Root__ex12() {
        c1 = new Component__1();
        c2 = new Component__2();
        c3 = new Component__3();
        System.out.println("Root()");
    }
    void dispose() {
        System.out.println("disposing Root");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
}

class Stem extends Root__ex12 {
    Component__1 cs1;
    Component__2 cs2;
    Component__3 cs3;
    Stem() {
        cs1 = new Component__1();
        cs2 = new Component__2();
        cs3 = new Component__3();
        System.out.println("Stem()");
    }
    void dispose() {
        System.out.println("disposing Stem");
        cs1.dispose();
        cs2.dispose();
        cs3.dispose();
        super.dispose();
    }
}

public class ex12 {
    public static void main(String[] args)
    {
    Stem s = new Stem();
   try {println(s);}
   finally
    {s.dispose();}
    }
}
