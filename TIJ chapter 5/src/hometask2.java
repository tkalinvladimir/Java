public class hometask2 {

    String a1 = "123";
    String a2;

    hometask2() {
        System.out.println("a1 " + a1);
        System.out.println("a2 " + a2);
        a2 = new String();
        System.out.println("Constructor");
        System.out.println("a1 " + a1);
        System.out.println("a2 " + a2);
    }


    public static void main(String[] args) {

        hometask2 a = new hometask2();
        System.out.println(a.a1 + "   " + a.a2);

    }
}
