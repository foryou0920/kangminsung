package ex1;

import com.sun.jmx.remote.internal.ClientListenerInfo;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiSocketServer {
   //��������
    private ServerSocket ss;
   //���ӵ� Ŭ���̾�Ʈ�� ����
    private Socket s;
   //Ŭ���̾�Ʈ ������ ������ Collection
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
        //������ �׻� ������..
        while (true) {
            try {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("Client Connected : [ " + reip + " ]");
                //������ ��ü���� ���� readLine�� ������ ���� *****
                ServerThread ct = new ServerThread(s, this);
                //�����尡 �����ɶ����� ArrayList�� ���
                clientlList.add(ct);
                System.out.println("Current number of clients : " + clientlList);
            } catch (IOException ex) {

            }

        }

    }

    public void sendMsg(String str1, ServerThread aThis) {
        String type1 = str1;
        String str = "";
        //ArrayList�� ��ϵ� ��� client�� �о�ͼ� �ϳ��� ������ ���Ͽ� �Է�
        //��Ʈ���� ���� str�޼����� �����Ѵ� 
        str = "[" + reip + "]" + type1;
        System.out.println("msg :" + str);
        //����������� �ϼ��� str�� ����

        for (ServerThread c : clientlList) {
            c.getPw().println(str);
        }
    }

    public static void main(String[] args) {
        MultiSocketServer mss = new MultiSocketServer();
        mss.execute();
    }

}
