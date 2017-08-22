public class ex1 {
    static Simple s;
    public static void main(String args[])
    {
        System.out.println("Start");
        if (s == null)
        {
            s = new Simple(); // отложенная инициализация
        }
        System.out.println("Stop");
    }
}

class Simple
{
    Simple()
    {
        System.out.println("Simple()");
    }
}