package open.example.firstExample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerHttpExample {
    private int SERVER_PORT;
    private ClientRequestDispatcher<Socket> _ClientRequestDispatcher;
    //server mode :
    //request comes for a session
    //server process it and then sends the response.

    public SimpleServerHttpExample(int SERVER_PORT) {
        this.SERVER_PORT = SERVER_PORT;
        _ClientRequestDispatcher = new ClientRequestDispatcher();
    }

    public void startServer() {
        while (true)
        {
            try {
                ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
                Socket clientSocket = serverSocket.accept();
                _ClientRequestDispatcher.addSocket(clientSocket);
            }
            catch (IOException e) {
                //add logger to print appropriate details
            }
        }
    }
}
