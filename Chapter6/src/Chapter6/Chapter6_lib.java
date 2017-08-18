package Chapter6;

public class Chapter6_lib {
    public Chapter6_lib() {
        System.out.println("Chapter6_package created");
    }
    public static void testFunc()
    {
        System.out.println("Test func");
    }

    protected void prtctdFunc()
    {
        System.out.println("protected func.");
    }
    public void prtctdFunc2()
    {
        Chapter6_lib ch6 = new Chapter6_lib();
        ch6.prtctdFunc();
    }
}
