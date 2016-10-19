public class hometask15 {

    public static void main (String[] args) {
        System.out.println("start");
        System.out.println("initialization in main" + new Str());
        System.out.println("stop");
    }

}


class Str {
    String s;
    {
        s = "инициализация";
        System.out.println(s+" completed");

    }


}
