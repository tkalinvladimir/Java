import Shape.*;
// @Override — проверяет, переопределён ли метод. Вызывает ошибку компиляции, если метод не найден в родительском классе или интерфейсе;

// ex2 - ex3 - ex4

public class ex2 {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for(Shape shp : s) {
            shp.draw();
            shp.text();
            System.out.println("----------------");
        }

    }
}
