
package ex2;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class Ex2_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress iaddr = InetAddress.getLocalHost();
        System.out.println("호스트이름 :" + iaddr.getHostName());
        System.out.println("호스트 아이피 :" + iaddr.getHostAddress());
        
        InetAddress iaddr2 = InetAddress.getByName("www.kosta.or.kr");
        System.out.println("호스트이름:"+ iaddr2.getHostName());
        System.out.println("IP : "+ iaddr2.getHostAddress());
        // 연습문제 GUI를 사용해서 사용자로부터 호스트를 입력받은 결과
        //IP들을 JtextArea에 출력하시오
        
    }

}
