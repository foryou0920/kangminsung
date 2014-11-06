package Homework;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    private ServerSocket ss;
    private HashMap<String, String> map;

    public Server() throws IOException {
        map = new HashMap<>();
        map.put("����", "�ȳ��ϼ���");
        map.put("��������?", "���� �Ϸ縦 ������ �־��");
        map.put("���ڿ�", "�³���^^");

        ss = new ServerSocket(7888);
        System.out.println("���������մϴ�");
        String path = "C:\\kosta86\\javaStudy\\workSpace\\java0924\\src\\Homework\\NewClass.properties";
        BufferedReader bread = new BufferedReader(new FileReader(path));
        Properties prop = new Properties();
        prop.load(bread);
        bread.close();

        ex:
        while (true) {
            try {
                Socket soc = ss.accept(); // blocking 
                System.out.println("Connect IP :" + soc.getInetAddress().getHostAddress());
                BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                PrintWriter out = new PrintWriter(new BufferedOutputStream(soc.getOutputStream()), true);

                while (true) {
                    String msg = br.readLine().trim();
                    System.out.println("MSG :" + msg);
                    if (prop.get(msg) != null) {
                        out.println(prop.get(msg));

                    } else {
                        out.println("�����");
                    }
                }
            } catch (SocketException e) {
                continue ex;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        new Server();
    }
}
