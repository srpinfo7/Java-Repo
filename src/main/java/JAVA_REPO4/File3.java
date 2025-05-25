package JAVA_REPO4;
//Scanning a Range of Ports to check it is Running or not
import java.io.IOException;
import java.net.ServerSocket;

public class File3 {

    public static void main(String[] args) {
        int startPort = 8000;
        int endPort = 8100;

        for (int port = startPort; port <= endPort; port++) {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                System.out.println("Port " + port + " is available.");
            } catch (IOException e) {
                System.out.println("Port " + port + " is in use.");
            }
        }
    }
}
