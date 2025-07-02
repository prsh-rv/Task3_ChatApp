import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static Set<Socket> clientSockets = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("Server started. Waiting for clients...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                clientSockets.add(socket);
                System.out.println("New client connected: " + socket);
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Inner class to handle each client
    static class ClientHandler extends Thread {
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    // Broadcast to all clients
                    for (Socket s : clientSockets) {
                        if (!s.isClosed()) {
                            PrintWriter clientOut = new PrintWriter(s.getOutputStream(), true);
                            clientOut.println("Client says: " + message);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Client disconnected: " + socket);
            } finally {
                try {
                    socket.close();
                    clientSockets.remove(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
