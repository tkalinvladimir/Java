public class Task6 {

    private int storage(String s)
    {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Task6 a123 = new Task6();
        String test = "test";
        System.out.println("String \"" + test + "\" storage is: " + a123.storage(test));
    }
}
