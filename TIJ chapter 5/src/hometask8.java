public class hometask8 {

    public static void main(String[] args) {
    hometask8class a = new hometask8class();
    a.dotests();
    }

}

class hometask8class {
    void dotests() {
        test("Тест без this");
        this.test("Тест с this");
    }

    void test(String s) {
        System.out.println(s);
    }
}