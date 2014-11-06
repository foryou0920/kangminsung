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

/**
 * @author kosta 
 * Document   : Ex2_Server Created on : 2014. 9. 24, ���� 10:53:25
 */
// ���������� �и��� ��ǻ�Ϳ��� ���������� ������ ������ü�� �����Ѵ�.
// ���񽺿� ����ϰ� �־�� �Ѵ�. accept()�޼��尡 ������ ������.
public class Ex2_Server {
    private ServerSocket ss;
    public Ex2_Server() {
        try {
            ss = new ServerSocket(8989);
            System.out.println("���� ����!");
            while(true){
            // accept() ����Ǹ� Ŭ���̾�Ʈ�� ���ϰ� ������ ��!
            Socket s = ss.accept(); // blocking 
            // ������  Ŭ���̾�Ʈ�� ������ �����Ǹ� ���
            String ip = s.getInetAddress().getHostAddress();
            System.out.println("Server Log1 :"+ip);
            
            // ����� Socket�� ����ؼ� Ŭ���̾�Ʈ�� ��û�� �ޱ�
            // ���� Input��Ʈ���� ������ ��
            // �ٽ� Ŭ���̾�Ʈ���� ���� ���ֱ� ���� Output��Ʈ����
            // �����ؼ� response�Ѵ�.
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                // PrintWriter�� Ư¡ 
                // - 1����Ʈ��, 2�� ��Ʈ��( Buffer�� ��� ) 
                // - ����Ʈ ��Ʈ�� , ���� ��Ʈ�� ���� ��� ����� �����ϴ�.
                // - �����÷���: �ڵ����� ���۸� ����ִ� ������ �����ڿ��� ���ڷ� ���� 
                // - ���ڿ��� ���ٴ����� ����Ʈ��Ʈ������ ���� �ϴ°��� ���� 
                PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
                //out.flush();
                // -- Ŭ���̾�Ʈ�� (����) ***** ���� ����� ��Ʈ���� ���ؼ�         
                // -- Ŭ���̾�Ʈ�� ��û�� ����
                String msg = br.readLine();
                msg = "["+ip+"]"+msg;
                System.out.println(msg);
                // -- ��û�� ���� ���� 
                out.println("�ݰ����ϴ�."+"["+ip+"]"+msg+"!");
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Port�� ������Դϴ�.");
        }
    }
    public static void main(String[] args) {
        new Ex2_Server();
    }
}