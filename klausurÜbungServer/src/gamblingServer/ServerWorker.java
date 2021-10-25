package gamblingServer;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class ServerWorker extends Thread {
    public final Socket clientSocket;
    public final GamblingServer server;
    public String login = null;
    public OutputStream outputStream;
    public boolean active = true;

    public ServerWorker(GamblingServer server, Socket clientSocket) {
        this.server = server;
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException, InterruptedException {
        InputStream inputStream = clientSocket.getInputStream();
        this.outputStream = clientSocket.getOutputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        boolean doIt = true;

        if(doIt){
            while ( (line = reader.readLine()) != null ){
                String[] tokens = line.split(" ");
                System.out.println(Arrays.toString(tokens));
                if(tokens != null && tokens.length > 0){
                    String cmd = tokens[0];
                    if("quit".equalsIgnoreCase(cmd) || "logoff".equalsIgnoreCase(cmd)){
                        //handleLogoff();
                        send("Vallah funktioniert");
                        System.out.println("Vallah funktioniert");
                        break;
                    } else if("login".equalsIgnoreCase(cmd)){
                        //handleLogin(outputStream, tokens);
                    } else {
                        String msg= "unknown " + cmd + "\n";
                        outputStream.write(msg.getBytes(StandardCharsets.UTF_8));
                    }
                }
            }
        }

        clientSocket.close();
    }

    private void send(String msg) {
        if (login != null){
            try {
                outputStream.write(msg.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
