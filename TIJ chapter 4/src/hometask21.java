public class hometask21 {

    public static int loop() {
        int i = 1;
        for (i = 1 ; i <= 100; i++) {
            System.out.print(i + " ");
            if (i == 99) {
                System.out.println();
                break;
            }
        }
        System.out.println("------------------");
        return i;
    }
    public static void main(String[] args) {
        System.out.println("loop goes to the number: " + loop());
    }

}
