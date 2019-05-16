package trello2;

import java.sql.*;

public class DBService {
    Statement statement;

    public DBService() throws SQLException {
        String username = "root";
        String password = "root";
        String connectionurl = "jdbc:mysql://localhost:3306/kanban";

        Connection connection = DriverManager.getConnection(connectionurl, username, password);
        this.statement = connection.createStatement();

            System.out.println("connected to db");
           // ResultSet resultSet = statement.executeQuery("SELECT * FROM  users");
            //while (resultSet.next()) {
              //  System.out.println(resultSet.getString("email")+" "+resultSet.getString("password"));
           // }

        }



    public void addUser(String email, String pass, int sessionID) throws SQLException {
        statement.executeUpdate("INSERT INTO users (email, password, sessionid) VALUE ('"+email+"','"+pass+"','"+sessionID+"')");
    }

}
