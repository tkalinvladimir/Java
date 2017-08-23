class X {
    private void f() { System.out.println("f()"); }
    private final void g() { System.out.println("g()"); }
    final void h() { System.out.println("h()"); }
    public void j() { System.out.println("j()"); }
    public void k() { System.out.println("k()"); }
}

class Y extends X {
    // @Override // override isn't possible here because original method is private
    private void f() { System.out.println("ef()"); }
    // @Override // original method is private
    private void g() { System.out.println("eg()"); }
    // @Override // original method is final
    // void h() { System.out.println("eh()"); }
    @Override
    public void j() { System.out.println("ej()"); }
    public void k() { System.out.println("ek()"); }
}

public class ex20 {
    public static void main(String[] args) {
        Y y = new Y();
        //b.f(); // can't call private method
        //b.g() // can't call private method;
        y.h();
        y.j();
        y.k();
        X x = y;
        //a.f(); // can't call private method
        //a.g(); // can't call private method
        x.h();
        x.j();
        y.k();
    }
}
