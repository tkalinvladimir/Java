public class hometask11 {


    public static void main(String[] args) {

        hmtsk11 app = new hmtsk11();
        new hmtsk11();
        System.gc();
        System.gc();
    }

}

class hmtsk11 {

    public void finalize() {

        System.out.println("Вызов finalize");
    }

}
