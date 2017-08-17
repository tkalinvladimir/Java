public class Task6
{

    int storage(String s)
    {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Task6 a = new Task6();
        String test = "test";
        System.out.println("String \"" + test + "\" storage is: " 
                + a.storage(test));
    }
}
