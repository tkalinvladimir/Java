package Chapter6;

import java.util.ArrayList;

class Connection
{
    Connection(int n) {
        System.out.println("Connection #" + n + " created");
    }
}

public class ConnectionManager {

    static int count = 0;
    static int max;
    static ArrayList<Connection> connections = new ArrayList<Connection>();

    public void createConnection(int max)
    {
        for (int i = 0; i < max; i++)
            connections.add(new Connection(i));
        this.max = this.max + max;
    }
    public Connection getConnection(int count)
    {
        return count >= max ? null : connections.get(count++);
    }
}
