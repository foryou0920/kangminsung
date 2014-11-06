package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
// 물리적으로 분리된 컴퓨터에서 서버소켓을 생성한 서버객체를 생성한다
//서비스에 대기하고 있어야 한다. accept()메서드가 그 일을 수행함

public class Ex2_Server {

    private ServerSocket ss;

    public Ex2_Server() {
        try {
            ss = new ServerSocket(9999);
            System.out.println("서버 시작!");
            while (true) {
//            accept() 수행되면 클라이언트의 소켓과 연결이 됨

                Socket s = ss.accept(); // blocking
                // 접속한 클라이언트의 소켓의 아이피를 얻기
                String ip = s.getInetAddress().getHostAddress();
                System.out.println("Server Log : " + ip);
                
                // 연결된 Socket을 사용해서 클라이언트의 요청을 받기
                // 위한 Input스트림을 생성한 후 
                // 다시 클라이언트에게 응답해주기 위한 Output스트림을 생성해서 
                // response한다.
                
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                //한줄단위로 받고 싶을때 
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                //한줄단위로 보내고 싶을때 
               
                PrintWriter pw =  new PrintWriter(new BufferedOutputStream(os),true);
                // byte스트림에 접근 가능하면서 문자를 직접 전송이 가능하다.
                // printwirter는 AutoFlush 기능이 있어 true를 사용해야한다.
                // PrintWriter의 특징 
                // 1차스트림 , 2차스트림(Buffer의기능)
                // 바이트스트림, 문자스트림 등을 모두 사용이 가능하다. 
                // autoFlush : 자동으로 버퍼를 비워주는 역할을 생성자에서 인자로 지정           
                
                String msg = br.readLine();
                System.out.println("["+ip+"]"+msg);
                // 요청에 대한 응답 
                pw.println("반갑습니다."+"["+ip+"]"+msg);
                       
            }

        } catch (IOException ex) {
            System.out.println("Port가 사용중입니다.");
        }

    } public static void main(String[] args) {
        new Ex2_Server();
    }
}
