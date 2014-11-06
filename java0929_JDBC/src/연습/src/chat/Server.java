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
            System.out.println("������ �۵��ǰ� �ֽ��ϴ�");
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
                System.out.println("���� �����Ǵ�" + reip + "�Դϴ�");
                ServerClient thread = new ServerClient(s, this);
                clientlist.add(thread);
                System.out.println("���� ���Ӽ���" + clientlist + "�Դϴ�");

            } catch (IOException ex) {

            }
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.execute();
        
    }

}
