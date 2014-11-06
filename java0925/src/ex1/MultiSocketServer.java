package ex1;

import com.sun.jmx.remote.internal.ClientListenerInfo;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiSocketServer {
   //서버소켓
    private ServerSocket ss;
   //접속된 클라이언트의 소켓
    private Socket s;
   //클라이언트 소켓을 저장할 Collection
    private ArrayList<ServerThread> clientlList;
   //
    private ArrayList<String> conClientList;
    private String reip;

    public MultiSocketServer() {
        try {
            ss = new ServerSocket(9898);
            System.out.println("** Server Start **");
            clientlList = new ArrayList<ServerThread>();
            conClientList = new ArrayList<>();
        } catch (IOException ex) {

        }
    }

    public void execute() {
        //서버는 항상 대기상태..
        while (true) {
            try {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("Client Connected : [ " + reip + " ]");
                //쓰레드 객체생성 한후 readLine을 위임한 상태 *****
                ServerThread ct = new ServerThread(s, this);
                //쓰레드가 생성될때마다 ArrayList에 기억
                clientlList.add(ct);
                System.out.println("Current number of clients : " + clientlList);
            } catch (IOException ex) {

            }

        }

    }

    public void sendMsg(String str1, ServerThread aThis) {
        String type1 = str1;
        String str = "";
        //ArrayList에 등록된 모든 client를 읽어와서 하나씩 각각의 소켓에 입력
        //스트림을 통해 str메세지를 전달한다 
        str = "[" + reip + "]" + type1;
        System.out.println("msg :" + str);
        //모든유저에게 완성된 str을 송출

        for (ServerThread c : clientlList) {
            c.getPw().println(str);
        }
    }

    public static void main(String[] args) {
        MultiSocketServer mss = new MultiSocketServer();
        mss.execute();
    }

}
