package ex2;
// Uniform Resource Locator
// 인터넷에서 접근 가능한 자원(Resqurce)의 주소를 표현할수 있는 형실 *** 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex2_URL {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String path = "http://sports.media.daum.net/sports/ag/incheon/?selectedNewsId=20140924100808533";
        String path2 = "http://www.daum.net/";
        URL url = new URL(path2);
        // URL Connection 객체는 반드시 URL클래스를 생성한 후 
        // 반환받아서 사용한다. ****
        URLConnection urlCon = url.openConnection();
        // URLConnection의 완성 
        urlCon.connect(); // 객체가 완성이 됨!!
        System.out.println("ConTentType :" + urlCon.getContentType());
        System.out.println("Length" + urlCon.getContentLength());
        //헤더필드의 content-length에 대한 value를 반환
//        OutputStream os = urlCon.getOutputStream();
//        os.write('A');
//        os.flush();
//        System.out.println("ConTentEncoding :" + urlCon.getContentEncoding());

        System.out.print(url.getPath());
        System.out.print(url.getHost());
        System.out.print(url.getPort());
        System.out.print(url.getProtocol());
        System.out.print(url.getContent());
        System.out.print(url.getRef());
        InputStream is = url.openStream();      // 1차스트림 
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        //안드로이드에서 할때 중요!! 
        String res = null;
        while ((res = br.readLine()) != null) {
            System.out.println(res);

        }
        // 자원 닫기 try catch finally
        //연습문제 : 사용자가 입력한 url의 소스를 
        //JtextArea에 출력하고 save버튼을 누르면 
        // 사용자가 지정한 경로에 파일이름으로 저장하는 기능을 구현하세요

    }

}
