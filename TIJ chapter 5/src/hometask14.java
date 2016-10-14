public class hometask14 {
    public static void main(String[] args) {
        staticTest.printStr();
    }
}

class staticTest {
    static String s1 = "test1";
    static String s2;
    static {
         s2 = "test2";
    }

    static public void printStr() {
        System.out.println(s1 + "    " + s2);
    }

}