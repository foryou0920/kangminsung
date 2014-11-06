package ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author kosta 
 * Document   : Ex1_InetAddress Created on : 2014. 9. 23, 오후 1:54:27
 */
public class Ex1_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress iaddr = InetAddress.getLocalHost();
        System.out.println("호스트 이름 :"+iaddr.getHostName());
        System.out.println("호스트 아이피 :"+iaddr.getHostAddress());
        
        InetAddress iaddr2 = InetAddress.getByName("naver.com");
         System.out.println("호스트 이름 :"+iaddr2.getHostName());
        System.out.println("IP :"+iaddr2.getHostAddress());
        // 연습문제 GUI를 사용해서 사용자로 부터 호스트를 입력 받은 결과
        // 아이피들을 jTextArea에 출력 하시오.
    }
}
