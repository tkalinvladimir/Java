public class hometask18 {
    public static void main (String[] args) {
        test_array2[] array = new test_array2[5];
        for (int i = 0; i <= 4; i++) {
            array[i] = new test_array2(Integer.toString(i));
        }
    }
}


class test_array2 {
    test_array2(String s) {
        System.out.println(s);
    }
}