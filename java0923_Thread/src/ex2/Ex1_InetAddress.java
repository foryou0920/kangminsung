package ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author kosta 
 * Document   : Ex1_InetAddress Created on : 2014. 9. 23, ���� 1:54:27
 */
public class Ex1_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress iaddr = InetAddress.getLocalHost();
        System.out.println("ȣ��Ʈ �̸� :"+iaddr.getHostName());
        System.out.println("ȣ��Ʈ ������ :"+iaddr.getHostAddress());
        
        InetAddress iaddr2 = InetAddress.getByName("naver.com");
         System.out.println("ȣ��Ʈ �̸� :"+iaddr2.getHostName());
        System.out.println("IP :"+iaddr2.getHostAddress());
        // �������� GUI�� ����ؼ� ����ڷ� ���� ȣ��Ʈ�� �Է� ���� ���
        // �����ǵ��� jTextArea�� ��� �Ͻÿ�.
    }
}
