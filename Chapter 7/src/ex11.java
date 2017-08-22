import static Chapter7.Chapter7_lib.*;
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        println(x);
    }
}

public class ex11 {
    private Cleanser cleanser = new Cleanser();
    public void append(String a) { cleanser.append(a); }
    public void dilute() { cleanser.dilute(); }
    public void apply() { cleanser.apply(); }
    public void scrub() {
        append(" Detergent.scrub()");
        cleanser.scrub();
    }
    public String toString() { return cleanser.toString(); }
    public void foam() { append(" foam()"); }
    public static void main(String[] args) {
        ex11 x = new ex11();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        println(x);
        println("Testing delegated class:");
        Cleanser.main(args);
    }
}
