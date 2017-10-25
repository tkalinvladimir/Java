import java.util.Arrays;

public class FileCopy
{
    public static int min(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        return arr[0];

    }

    public static int min(int a, int b) {
        int[] arr = {a,b};
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}