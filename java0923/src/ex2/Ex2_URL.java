package ex2;
// Uniform Resource Locator
// ���ͳݿ��� ���� ������ �ڿ�(Resqurce)�� �ּҸ� ǥ���Ҽ� �ִ� ���� *** 

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
        // URL Connection ��ü�� �ݵ�� URLŬ������ ������ �� 
        // ��ȯ�޾Ƽ� ����Ѵ�. ****
        URLConnection urlCon = url.openConnection();
        // URLConnection�� �ϼ� 
        urlCon.connect(); // ��ü�� �ϼ��� ��!!
        System.out.println("ConTentType :" + urlCon.getContentType());
        System.out.println("Length" + urlCon.getContentLength());
        //����ʵ��� content-length�� ���� value�� ��ȯ
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
        InputStream is = url.openStream();      // 1����Ʈ�� 
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        //�ȵ���̵忡�� �Ҷ� �߿�!! 
        String res = null;
        while ((res = br.readLine()) != null) {
            System.out.println(res);

        }
        // �ڿ� �ݱ� try catch finally
        //�������� : ����ڰ� �Է��� url�� �ҽ��� 
        //JtextArea�� ����ϰ� save��ư�� ������ 
        // ����ڰ� ������ ��ο� �����̸����� �����ϴ� ����� �����ϼ���

    }

}
