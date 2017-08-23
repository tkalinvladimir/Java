class Aa {
    final void f() { System.out.println("A.f()"); }
}

class Bb extends Aa {
    // void f() { System.out.println("B.f()"); } // can't override final method
}

class Cc extends Aa {
    // @Override void f() { System.out.println("C.f()"); } // can't override
    // final method
}

public class ex21 {
    public static void main(String[] args) {
        Cc c = new Cc();
        c.f();
        Bb b = new Bb();
        b.f();
        Aa a = new Aa();
        a.f();
    }
}
