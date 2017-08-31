

class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int a = 2,
            b = 3;
    RectangularGlyph(int x, int y) {
        a = x;
        b = y;
        System.out.println("RectangularGlyph.RectangularGlyph(), a = " + a + ", b = " + b);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), a = " + a + ", b = " + b);
    }
}
public class ex15 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(42, 47);
    }
}

