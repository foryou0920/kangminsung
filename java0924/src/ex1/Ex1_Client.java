package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_Client {

    private Socket s;
    private HashMap map;
    Ex1_Client() {
        
        HashMap map = new HashMap(); 
        map.put("�ȳ�", "�ȳ����!");
        map.put("����", "������ ��ô�??");
        map.put("���ϰ��־�?", "���󵵵�");
        try {
            s = new Socket("192.168.7.149", 8989);
            InputStream is = s.getInputStream();// �޴�
            OutputStream os = s.getOutputStream();//������
            //���ٴ����� �ް� ������ 
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //���ٴ����� ������ ������ 

            PrintWriter pw = new PrintWriter(new BufferedOutput Stream(os), true);
            //Ŭ���̾�Ʈ�� ������ ��û�� ������ �۾�
            pw.println("������׿�");
            String ms = br.readLine();
            System.out.println(ms);
        } catch (IOException ex) {

        }
    }

    public static void main(String[] args) {
        new Ex1_Client();
    }

}
