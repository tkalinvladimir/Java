public class hometask12 {

    public static void main(String[] args) {

        Tank tank1 = new Tank();
        System.gc();
        tank1.setEmpty();
        System.gc();
        new Tank();
        System.gc();
        new Tank().setEmpty();
        System.gc();
    }
}

class Tank {
    boolean isEmpty ;

    Tank() {
        isEmpty = false;
    }

    public void setEmpty() {
        isEmpty = true;
    }

    public void finalize() {
        if (isEmpty) {
            System.out.println("finalize смог");
        }
        else {
            System.out.println("finalize не смог");
        }
    }
}