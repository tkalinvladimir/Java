public class hometask21 {

    public static void main(String[] args) {
        for (money str:money.values()) {
            System.out.println("" + str + "   " + str.ordinal());
        }
    }
    public enum money {
        USD, EURO, YEN, RUBLE
    }
}

