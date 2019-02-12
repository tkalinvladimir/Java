package main;

import accounts.AccountService;
import dbService.DBService;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.SignInServlet;
import servlets.SignUpServlet;

public class Main {
    public static void main(String[] args) throws Exception {

      /*database*/
        DBService dbService = new DBService();
        dbService.printConnectInfo();


        /*server*/
        AccountService accountService = new AccountService(dbService);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(new SignUpServlet(accountService)), "/signup");
        context.addServlet(new ServletHolder(new SignInServlet(accountService)), "/signin");

        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setResourceBase("public_html");

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{resource_handler, context});

        Server server = new Server(8083);
        server.setHandler(handlers);

        System.out.println("Server started");

        server.start();
        server.join();


       /* Driver driver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
        DriverManager.registerDriver(driver);
        StringBuilder url = new StringBuilder();
        url.
        append("jdbc:mysql://").
        append("localhost:").
        append("3306/").
        append("db_example").
        append("admin").
        append("adminpass");

        Connection connection = (Connection) DriverManager.getConnection(url.toString());
        connection.setAutoCommit(false);
        connection.commit();
        connection.rollback();
        connection.setSavepoint();
        Statement statement = (Statement) connection.createStatement();
        statement.execute("123412");
        int upd = statement.getUpdateCount();
        statement.close();



        connection.close();
*/

       /* auth
         AccountService accountService = new AccountService();
        accountService.addNewUser(new UserProfile("admin"));
        accountService.addNewUser(new UserProfile("test"));

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.addServlet(new ServletHolder(new UsersServlet(accountService)), "/api/v1/users");
        contextHandler.addServlet(new ServletHolder(new SessionsServlet(accountService)), "/api/v1/sessions");

        // По заданию
        contextHandler.addServlet(new ServletHolder(new SignUpServlet(accountService)), "/signup");
        contextHandler.addServlet(new ServletHolder(new SignInServlet(accountService)), "/signin");

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setResourceBase("public_html");

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{resourceHandler, contextHandler});

        Server server = new Server(8080);
        server.setHandler(handlers);
        //
        server.start();
        java.util.logging.Logger.getGlobal().info("Server started");
        server.join();

        */

        // old
        /*AllRequestsServlet allRequestServlet = new AllRequestsServlet();
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServletHolder(allRequestServlet), "/*");

        server.start();
        java.util.logging.Logger.getGlobal().log(Level.INFO, "Server started!");
        server.join();*/
    }
}
