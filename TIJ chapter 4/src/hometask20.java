public class hometask20 {

    public static void main(String[] args) {
        System.out.println(test(5,1,10));
        System.out.println(test(-1,1,10));
        System.out.println(test(11,1,10));
    }

    private static String test(int num, int begin, int end) {
        String answer = "";
        if (num >= begin && num <=end) {
            answer = ("" + num + " is between " + begin + " and " + end);
        }
        else if (num <= begin) {
            answer = ("" + num + " is to the left from " + begin);
        }
        else if (num >= end) {
            answer = ("" + num + " is to the right from " + end);
        }
        return answer;
    }

}
