import java.util.Arrays;

public class hometask24 {

    public static void main(String[] args) {

        vampires1();
        System.out.println("=========================");
        vampires2();


    }

    private static void vampires1() {

        int[] digit = new int[4];
        for (int i = 1000; i < 10000; i++) {
            digit[0] = i / 1000;    // 9999 / 1000 = 9
            digit[1] = i % 1000 / 100;  // 9999 % 1000 = 999/100 = 9
            digit[2] = i % 100 / 10; // 9999 % 100 = 99 /10 = 9
            digit[3] = i % 10; // 9999 % 10 = 9
            goto_haha:
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;
                    for (int l = 0; l < 4; l++) {
                        if ((l == j) || (l == k)) continue;
                        for (int m = 0; m < 4; m++) {
                            if (m == l || m == k || m == j) continue;
                            if ((digit[j] * 10 + digit[k]) * (digit[l] * 10 + digit[m]) == i) {
                                System.out.print((digit[j] * 10 + digit[k]));
                                System.out.print("*");
                                System.out.print((digit[l] * 10 + digit[m]));
                                System.out.print("=");
                                System.out.print(i);
                                System.out.println();
                                break goto_haha;

                            }
                        }
                    }
                }
            }
        }

    }

    private static void vampires2() {

        for (int i = 10; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                int s = i * j;

                //число s преобразовываем в строку, затем записываем в массив символов
                char b[] = Integer.toString(s).toCharArray();
                Arrays.sort(b); //сортировка массива символов

                //так само поступаем с каждым множителем
                String x = Integer.toString(i);
                String y = Integer.toString(j);
                //конкатенация строк (чисел-множителей)
                String z = x + y;
                //запись строки в массив символов
                char p[] = z.toCharArray();
                Arrays.sort(p); //сортировка массива символов

                //сравнение массивов символов
                if (Arrays.equals(b, p)) {
                    System.out.println(i + " * " + j + " = " + s);
                }

            }
        }

    }
}