public class hometask22 {

    money cash;
    int howMuch;

    public hometask22(money cash, int howMuch) {
        this.cash=cash;
        this.howMuch = howMuch;
    }

    public void describe() {
        switch (cash) {
            case USD:
                System.out.println("Баксы - "+this.howMuch);
                break;
            case EURO:
                System.out.println("Еврики - "+this.howMuch);
                break;
            case YEN:
                System.out.println("Йены - "+this.howMuch);
                break;
            case RUBLE:
                System.out.println("Рубли - "+this.howMuch);
                break;
        }
    }

    public static void main(String[] args) {
        hometask22 usd = new hometask22(money.USD, 10), eur = new hometask22(money.EURO, 20), yen = new hometask22(money.YEN, 50), rub = new hometask22(money.RUBLE, 999);
        System.out.println("I have:");
        usd.describe();
        eur.describe();
        yen.describe();
        rub.describe();
    }

    public enum money {
        USD, EURO, YEN, RUBLE
    }
}
