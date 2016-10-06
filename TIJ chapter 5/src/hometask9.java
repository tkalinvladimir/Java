public class hometask9 {

    public static void main(String[] args) {
        contructorTest a = new contructorTest(15);
        System.out.println(a.s + " " + a.msg);
    }

}

class contructorTest {
    int s;
    String msg;


    contructorTest(int s) {

        this(s, "Оптовик");
        System.out.println("Конструктор с интом");

    }

    contructorTest(int s, String msg) {
        System.out.println("Конструктор с интом и сообщением");
        this.s = s;
        this.msg = msg;
    }
}