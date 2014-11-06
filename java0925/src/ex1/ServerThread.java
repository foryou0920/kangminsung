package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerThread {

    private Socket socket;
    // �����κ��� ���ӹ��� ����
    private MultiSocketServer server;
    // �������κ��� ����� �� ��Ʈ��
    private PrintWriter pw;
    private BufferedReader in;
    // �г���
    private String nickName;

    public ServerThread(Socket socket, MultiSocketServer server) {
        this.socket = socket;
        this.server = server;
        
       try {
            pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()),true);
        } catch (IOException ex) {
           
        }

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    in = new BufferedReader(new InputStreamReader(ServerThread.this.socket.getInputStream()));
                    while (true) {
                        String msg = in.readLine();
                        transMsg(msg);
                    }
                } catch (IOException ex) {
                  
                }
            }

            private void transMsg(String msg) {
                // ������ sendMsg()�� ȣ���Ҷ� �޼����� ���� 
                ServerThread.this.server.sendMsg(msg, ServerThread.this);
            }
        });
        // Thread�� start�ؼ� �����ٷ����� ���� ��û�Ѵ�
        t.start();
    }

    public PrintWriter getPw() {
        return pw;
    }

    public String getNickName() {
        return nickName;
    }
    

}
