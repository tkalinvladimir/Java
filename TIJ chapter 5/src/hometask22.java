public class hometask22 {

    money cash;
    int howMuch;

    public hometask22(money cash, int howMuch) {
        this.cash=cash;
        this.howMuch = howMuch;
    }

    static void describe(hometask22... arr) {
        for (hometask22 arrItem:arr) {
            switch (arrItem.cash) {
                case USD:
                    System.out.println("Баксы - "+arrItem.howMuch);
                    break;
                case EURO:
                    System.out.println("Еврики - "+arrItem.howMuch);
                    break;
                case YEN:
                    System.out.println("Йены - "+arrItem.howMuch);
                    break;
                case RUBLE:
                    System.out.println("Рубли - "+arrItem.howMuch);
                    break;
            }
        }

    }

    public static void main(String[] args) {
        hometask22[] arr = new hometask22[4];
        hometask22 usd = new hometask22(money.USD, 10), eur = new hometask22(money.EURO, 20), yen = new hometask22(money.YEN, 50), rub = new hometask22(money.RUBLE, 999);
        arr[0] = usd;
        arr[1] = eur;
        arr[2] = yen;
        arr[3] = rub;

        System.out.println("I have:");
        hometask22.describe(arr);
    }

    public enum money {
        USD, EURO, YEN, RUBLE
    }
}
