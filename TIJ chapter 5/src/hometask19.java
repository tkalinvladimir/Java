public class hometask19 {

    public static void main(String[] args) {
        getStr("123","243","345");
        getStr(new String[] {"123","243","345"});
    }

    public static void getStr(String... s) {
        for (String str:s) {
            System.out.println(str);
        }
        System.out.println("=========================");
    }

}
