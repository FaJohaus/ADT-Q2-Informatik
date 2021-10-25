package gamblingServer;

public class ServerMain {
    public static void main(String[] args) {
        int port = 8818;
        GamblingServer server = new GamblingServer(port);
        server.start();
    }
}
