package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author kosta 
 * Document   : Ex2_URL Created on : 2014. 9. 23, 오후 3:02:10
 */
// Uniform Resource Locator 
// 인터넷에서 접근 가능한 자원(Resource)의 주소를 표현할 수 있는 형식 ***
public class Ex2_URL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String path ="http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1634&pageNum=1#a";
        String path2 ="http://www.kosta.or.kr";
        URL url = new URL(path2);
        // URLConnection 객체는 반드시 URL클래스를 생성한 후
        // 반환받아서 사용한다. *****
        URLConnection urlCon = url.openConnection();
        // URLConnection의 완성
        urlCon.connect(); // 객체가 완성이됨
        String cType = urlCon.getContentType();
        String[] enc = cType.split("=");
        System.out.println(enc[1]);
        //text/html;charset=UTF-8/text/html;charset=euc-kr
        //System.out.println("ContentType :"+);
        
        // 해더 필드의 content-length에 대한 value를 바ㄴ호ㅏㄴ 
        System.out.println("Length"+urlCon.getContentLength());
//        OutputStream os = urlCon.getOutputStream();
//        os.write('A');
//        os.flush();
        System.out.println();
       // System.out.println("ContentEncoding :"+urlCon.getContentEncoding());
        
        System.out.println(url.getPath());//clazzregister/clazzRegister_findClazzWithContents
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getContent());

        System.out.println(url.getRef()); // a
        InputStream is = url.openStream();
        // -- ** : 안드로이드 할때 봅시다.
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, enc[1]));
        String res =  null;
        while ((res = br.readLine()) != null) {            
            System.out.println(res);
        }
        // 자원 닫기 try catch finally\
        // 연습문제 : 사용자가 입력한 url의 소스를
        // jTextArea에 출려하고 save버튼을 누르면 
        // 사용자가 지정한 경로에 파일 이름으로 저장하는 기능을 구현하시오,
    }
}
