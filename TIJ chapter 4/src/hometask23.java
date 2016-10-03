public class hometask23 {

    public static int arg = 0;

    public static void main(String[] args) {
        if (args.length == 1) {
            arg = Integer.parseInt(args[0]);
            if (arg <= 0) {
                System.out.println("wrong");
            } else if (arg == 1) {
                System.out.println(arg + " " + arg);
            } else {
                printFibonachi(arg);
            }
        }
    }

    private static void printFibonachi(int arg) {
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < arg; i++) {
            int c = a + b;
            a = b;
            b = c;
            if (c <= arg) {
                System.out.print(" " + c);
            }
        }
    }

}