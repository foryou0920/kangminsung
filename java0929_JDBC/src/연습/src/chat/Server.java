package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    private ServerSocket ss;
    private Socket s;
    private ArrayList<ServerClient> clientlist;
    private ArrayList<String> conclientlist;
    private String reip;

    public Server() {
        try {
            ss = new ServerSocket(9999);
            System.out.println("서버가 작동되고 있습니다");
            clientlist = new ArrayList<ServerClient>();
            conclientlist = new ArrayList<>();

        } catch (IOException ex) {

        }
    }

    public void execute() {
        while (true) {
            try {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("고객의 아이피는" + reip + "입니다");
                ServerClient thread = new ServerClient(s, this);
                clientlist.add(thread);
                System.out.println("현재 접속수는" + clientlist + "입니다");

            } catch (IOException ex) {

            }
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.execute();
        
    }

}
