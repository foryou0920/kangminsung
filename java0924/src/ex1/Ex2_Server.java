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
// ���������� �и��� ��ǻ�Ϳ��� ���������� ������ ������ü�� �����Ѵ�
//���񽺿� ����ϰ� �־�� �Ѵ�. accept()�޼��尡 �� ���� ������

public class Ex2_Server {

    private ServerSocket ss;

    public Ex2_Server() {
        try {
            ss = new ServerSocket(9999);
            System.out.println("���� ����!");
            while (true) {
//            accept() ����Ǹ� Ŭ���̾�Ʈ�� ���ϰ� ������ ��

                Socket s = ss.accept(); // blocking
                // ������ Ŭ���̾�Ʈ�� ������ �����Ǹ� ���
                String ip = s.getInetAddress().getHostAddress();
                System.out.println("Server Log : " + ip);
                
                // ����� Socket�� ����ؼ� Ŭ���̾�Ʈ�� ��û�� �ޱ�
                // ���� Input��Ʈ���� ������ �� 
                // �ٽ� Ŭ���̾�Ʈ���� �������ֱ� ���� Output��Ʈ���� �����ؼ� 
                // response�Ѵ�.
                
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                //���ٴ����� �ް� ������ 
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                //���ٴ����� ������ ������ 
               
                PrintWriter pw =  new PrintWriter(new BufferedOutputStream(os),true);
                // byte��Ʈ���� ���� �����ϸ鼭 ���ڸ� ���� ������ �����ϴ�.
                // printwirter�� AutoFlush ����� �־� true�� ����ؾ��Ѵ�.
                // PrintWriter�� Ư¡ 
                // 1����Ʈ�� , 2����Ʈ��(Buffer�Ǳ��)
                // ����Ʈ��Ʈ��, ���ڽ�Ʈ�� ���� ��� ����� �����ϴ�. 
                // autoFlush : �ڵ����� ���۸� ����ִ� ������ �����ڿ��� ���ڷ� ����           
                
                String msg = br.readLine();
                System.out.println("["+ip+"]"+msg);
                // ��û�� ���� ���� 
                pw.println("�ݰ����ϴ�."+"["+ip+"]"+msg);
                       
            }

        } catch (IOException ex) {
            System.out.println("Port�� ������Դϴ�.");
        }

    } public static void main(String[] args) {
        new Ex2_Server();
    }
}
