import java.util.*;

public class test {
    public static ArrayList<Integer> s = new ArrayList<Integer>();
    static boolean isprimary(int i){
        if ((i%2 == 0 && i != 2) || (i%3 == 0 && i != 3) || (i%5 == 0&& i != 5) || (i%7 == 0&& i != 7)){
            return false;
        }
        return true;
    }

    static void getMnozhitel(int N){
            for (int i = 2; i < N / 2; i++) {
                if (isprimary(i)) {
                    if (N % i == 0) {
                        //s += i;
                        s.add(i);
                        N = N / i;
                        if (isprimary(N)) {
                            //s += N;
                            s.add(N);
                            N = 0;
                        }
                        if (N > 1) {
                            getMnozhitel(N);
                            break;
                        }
                    }
                }
            }
        }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1 - разложить натуральное число на простые множители
        System.out.println("Введите натуральное число для разложения на множители(простые)    ");
        int N = sc.nextInt();
        String answer = "";
        if (N > 1){
           getMnozhitel(N);
        }
        System.out.print(N+" = ");


        for (int i = 0; i < s.size(); i ++) {
            if (i == s.size()-1) {
                System.out.println(s.get(i));
            }
            else{
                System.out.print(s.get(i) + " * ");
                }
            }
     /*   //2 - найти ближайшую степень двойки к заданному числу
        System.out.println("Введите натуральное число чтобы найти ближайшую степень двойки     ");
        N = sc.nextInt();
        int prev = 0, next = 0;
        if (N > 1) {
            while(prev == 0 || next == 0){
                prev ++;
                if (Math.pow(2,prev) > N){
                    next = prev;
                    prev --;
                }
                else if(Math.pow(2,prev) == N) {
                    next = prev;
                }
            }
            if (N - Math.pow(2, prev) < Math.pow(2, next)-N){
                System.out.println("Ближайшая степень двойки - "+prev);
            }
            else{
                System.out.println("Ближайшая степень двойки - "+next);
            }
        }
        else{
            System.out.println("Ближайшая степень двойки - 0");
        }

        String s = Integer.toBinaryString(N);
        next = s.length() -  s.indexOf("1") ;
        next+= (next - s.substring(s.indexOf("1")+1).indexOf("1"))/next;
        next--;
        System.out.println("Ближайшая степень двойки по методу желудкова- "+next);

*/
    }
}
