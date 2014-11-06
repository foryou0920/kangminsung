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
    // 서버로부터 위임받은 소켓
    private MultiSocketServer server;
    // 소켓으로부터 연결된 두 스트림
    private PrintWriter pw;
    private BufferedReader in;
    // 닉네임
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
                // 서버의 sendMsg()를 호출할때 메세지를 전달 
                ServerThread.this.server.sendMsg(msg, ServerThread.this);
            }
        });
        // Thread를 start해서 스케줄러에게 일을 요청한다
        t.start();
    }

    public PrintWriter getPw() {
        return pw;
    }

    public String getNickName() {
        return nickName;
    }
    

}
