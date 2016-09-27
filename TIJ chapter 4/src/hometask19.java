

public class hometask19 {

    /* было
            int a = 0xAAAAAAAA;
        int b = 0x55555555;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("~b = " + Integer.toBinaryString(~b));

     */

    public static void printlnBinaryString(int x) {
        /*char[] array = new char[32]; // От 0 до 31 т.к. инт весит 32 бит
        boolean truncate = true;
        for (int i = 31; i >= 0; i--) {  // начинаем с начала, но так как биты идут справа налево то вот так
            array[31 - i] = (x & (1 << i)) == 0 ? '0' : '1';   // от старшего бита к младшему. сравниваем с единицей. старший бит - ближе к началу массива
        }
        for (int i = 0; i < 32; i++) {  // не выводим ничего до первой единицы. после того как вывели единицу - выводим весь оставшийся массив
            if (!truncate) {
                System.out.print(array[i]);
            }
            else if (truncate && array[i] == '1') {
                truncate = false;
                System.out.print(array[i]);
            }
        }
        if (truncate) {  // если в массив было нечего положить то выводим 0
            System.out.print('0');
        }
        System.out.println();  */

       /* boolean truncate = true;
        char bit;
        for (int i = 31; i >= 0; i--) {  // начинаем с начала, но так как биты идут справа налево то вот так
            bit = (x & (1 << i)) == 0 ? '0' : '1';   // от старшего бита к младшему. сравниваем с единицей. старший бит - ближе к началу массива
            if (!truncate) {
                System.out.print(bit);
            }
            else if (truncate && bit == '1') {
                truncate = false;
                System.out.print(bit);
            }
        }
        if (truncate) {  // если в массив было нечего положить то выводим 0
            System.out.print('0');
        }
        System.out.println();*/


       String c = new String();
       for (int i = 0; i <= 31; i++) {  // начинаем с начала, но так как биты идут справа налево то вот так

           c = ((x & 1) == 0 ? "0": "1") + c;   // от старшего бита к младшему. сравниваем с единицей. старший бит - ближе к началу массива
           x = x >> 1;
           if(x == 0 )break;
        }
        System.out.println(c);

    }
    public static void main(String[] args) {
        int a = 0xAAAAAAAA;
        int b = 0x55555555;
        System.out.print("a = "); printlnBinaryString(a);
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.print("b = "); printlnBinaryString(b);
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.print("a & b = "); printlnBinaryString(a & b);
        System.out.println("a & b = "+ Integer.toBinaryString(a & b));
        System.out.print("a | b = "); printlnBinaryString(a | b);
        System.out.println("a | b = "+ Integer.toBinaryString(a | b));
        System.out.print("a ^ b = "); printlnBinaryString(a ^ b);
        System.out.println("a ^ b = "+ Integer.toBinaryString(a ^ b));
        System.out.print("~a = "); printlnBinaryString(~a);
        System.out.println("~a = "+ Integer.toBinaryString(~a));
        System.out.print("~b = "); printlnBinaryString(~b);
        System.out.println("~b = "+ Integer.toBinaryString(~b));
    }
}
