class A_ex13 {
    public void f(int x) {
        System.out.println("int");
    }

    public void f(char x) {
        System.out.println("char");
    }

    public void f(float x) {
        System.out.println("float");
    }
}

public class ex13 extends A_ex13 {
    public void f(String x)
    {
        System.out.println("string");
    }
    public static void main(String[] args)
    {
        ex13 ex1_obj = new ex13();
        ex1_obj.f("123");
        ex1_obj.f(1);
        ex1_obj.f('c');
        ex1_obj.f(1.86f);
    }
}
