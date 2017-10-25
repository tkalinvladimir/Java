import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        System.out.println ("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}