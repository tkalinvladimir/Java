public class hometask4 {
    hometask4() {
        System.out.println("Я конструктор без параметров");
    }
    hometask4(String s) {
        System.out.println(s + " - Я конструктор с параметром");
    }
    public static void main(String[] args) {
        hometask4 class_1 = new hometask4();
        hometask4 class_2 = new hometask4("Конструктор с параметром");
    }

}
