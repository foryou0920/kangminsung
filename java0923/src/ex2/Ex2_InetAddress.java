
package ex2;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class Ex2_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress iaddr = InetAddress.getLocalHost();
        System.out.println("ȣ��Ʈ�̸� :" + iaddr.getHostName());
        System.out.println("ȣ��Ʈ ������ :" + iaddr.getHostAddress());
        
        InetAddress iaddr2 = InetAddress.getByName("www.kosta.or.kr");
        System.out.println("ȣ��Ʈ�̸�:"+ iaddr2.getHostName());
        System.out.println("IP : "+ iaddr2.getHostAddress());
        // �������� GUI�� ����ؼ� ����ڷκ��� ȣ��Ʈ�� �Է¹��� ���
        //IP���� JtextArea�� ����Ͻÿ�
        
    }

}
