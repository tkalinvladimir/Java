class A{
    public void test1(){System.out.println("A.test1()"); test2();}
    public void test2(){System.out.println("A.test2()");}
}

class B extends A{
    @Override
    public void test2(){System.out.println("B.test2()");}
}

public class ex10 {
   public static void main(String[] args){
       A test = new B();
       test.test1();
   }
}
