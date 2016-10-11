public class hometask10 {


    public static void main(String[] args) {

        hmtsk10 app = new hmtsk10();
        new hmtsk10();
    }

}

class hmtsk10 {

    public void finalize() {

        System.out.println("Вызов finalize");

    }

}
