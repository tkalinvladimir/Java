import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {

    String[] advicelist = {"Ешьте больше", "Ешьте меньше"};

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while(true) {
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (Exception e) {e.printStackTrace();}
    }

    private String getAdvice() {
        int random = (int)(Math.random() * advicelist.length);
        return  advicelist[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
