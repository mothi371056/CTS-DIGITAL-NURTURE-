// Server.java
package tcpchat;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket =
                    new ServerSocket(5000);

            System.out.println("Server Started...");
            System.out.println("Waiting for Client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client Connected");

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()
                            )
                    );

            String message = input.readLine();

            System.out.println("Client Message: " + message);

            serverSocket.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}