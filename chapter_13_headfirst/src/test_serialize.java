import java.io.*;

public class test_serialize implements Serializable {
    private int x;
    private int y;
    private transient Duck d = new Duck();
    public void setX(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }

    public static void main(String[] args) {
        test_serialize t = new test_serialize();
        t.setX(1);
        t.sety(2);
        try {
            FileOutputStream f = new FileOutputStream("test.ser");
            ObjectOutputStream ob = new ObjectOutputStream(f);
            ob.writeObject(t);
            ob.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(t.x+"   "+t.y);
        t = null;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
            t = (test_serialize) is.readObject();
            System.out.println(t.x+"   "+t.y);
        } catch (Exception e){}

    }
}

class Duck {

}
