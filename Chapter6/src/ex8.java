import Chapter6.*;


public class ex8 {
    public static void main(String args[])
    {
        System.out.println("Generate connections!");
        ConnectionManager c = new ConnectionManager();
        c.createConnection(11);
        for (int i = 0; i <= 15; i++) {
            System.out.println("trying to get connection #" + i + ": " + c.getConnection(i));
        }
        System.out.println("++++++++++++++++++++++++");
        c.createConnection(5);
        System.out.println("++++++++++++++++++++++++");
        for (int i = 0; i <= 17; i++) {
            System.out.println("trying to get connection #" + i + ": " + c.getConnection(i));
        }


       // PackagedClass p = new PackagedClass();
    }
}
