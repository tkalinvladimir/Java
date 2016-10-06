public class test_this {
    int i;

    test_this increment() {
        i++;
        return this;
    }

    void output() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        test_this a = new test_this();
        a.increment().increment().increment().output(); // цепочный вызов. обязательно для использования возвращать объект
    }
}
