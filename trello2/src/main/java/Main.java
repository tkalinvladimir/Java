import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class Main {
    public static void main(String[] args) throws Exception {
        // db
        /*String username = "root";
        String password = "root";
        String connectionurl = "jdbc:mysql://localhost:3306/kanban";

        try(Connection connection = DriverManager.getConnection(connectionurl, username, password);
            Statement statement = connection.createStatement()) {

            System.out.println("connected");
            statement.executeUpdate("INSERT INTO users (email, password, sessionid) VALUES ('tkalin.vladimir@gmail.com', '123', '0')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM  users");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("email")+" "+resultSet.getString("password"));
            }

        }*/
        DBService dbService = new DBService();

        // server
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(new RegisterServlet(dbService)), "/register");

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setResourceBase("public_html");

        HandlerList handlerList = new HandlerList();
        handlerList.setHandlers(new Handler[]{resourceHandler, context});

        Server server = new Server(8080);
        server.setHandler(handlerList);
        server.start();
        server.join();


    }
}
