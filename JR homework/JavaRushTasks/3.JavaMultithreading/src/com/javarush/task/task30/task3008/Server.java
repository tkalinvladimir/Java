package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера: ");
        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Server started.");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
                continue;
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Error.");
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection:connectionMap.values()) {
            try {
                connection.send(message);
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Error. Can't send message");
            }
        }
    }


    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String userName = null;
            ConsoleHelper.writeMessage("New connection - "+socket.getRemoteSocketAddress());
            try (Connection connection = new Connection(socket)){
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException  | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Error exchange with server.");
            } finally {
                if (userName!=null) {
                   connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
                ConsoleHelper.writeMessage("Closed connection");
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();

                if (answer.getType() == MessageType.USER_NAME) {

                    if (!answer.getData().isEmpty()) {
                        if (!connectionMap.containsKey(answer.getData())) {
                            connectionMap.put(answer.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return answer.getData();
                        }
                    }
                }
            }
        }


        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for(ConcurrentHashMap.Entry<String, Connection> entry:connectionMap.entrySet()) {
                if (!entry.getKey().equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message msg = connection.receive();
                if (msg.getType()==MessageType.TEXT) {
                    Message new_msg = new Message(MessageType.TEXT, userName+": "+msg.getData());
                    sendBroadcastMessage(new_msg);
                }
                else {
                    ConsoleHelper.writeMessage("Error message");
                }
            }
        }
        
    }

}
