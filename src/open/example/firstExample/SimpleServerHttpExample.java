package open.example.firstExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerHttpExample {
    private int SERVER_PORT;
    //server mode :
    //request comes for a session
    //server process it and then sends the response.

    public SimpleServerHttpExample(int SERVER_PORT) {
        this.SERVER_PORT = SERVER_PORT;
    }

    public void startServer() {
        while (true)
        {
            try {
                ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
                Socket clientSocket = serverSocket.accept();
                ServerSocketMananger serverSocketMananger = ;
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
            }
            catch (IOException e) {
                //add logger to print appropriate details
            }
        }
    }
}
