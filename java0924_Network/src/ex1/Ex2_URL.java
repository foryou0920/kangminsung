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
 * Document   : Ex2_URL Created on : 2014. 9. 23, ���� 3:02:10
 */
// Uniform Resource Locator 
// ���ͳݿ��� ���� ������ �ڿ�(Resource)�� �ּҸ� ǥ���� �� �ִ� ���� ***
public class Ex2_URL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String path ="http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1634&pageNum=1#a";
        String path2 ="http://www.kosta.or.kr";
        URL url = new URL(path2);
        // URLConnection ��ü�� �ݵ�� URLŬ������ ������ ��
        // ��ȯ�޾Ƽ� ����Ѵ�. *****
        URLConnection urlCon = url.openConnection();
        // URLConnection�� �ϼ�
        urlCon.connect(); // ��ü�� �ϼ��̵�
        String cType = urlCon.getContentType();
        String[] enc = cType.split("=");
        System.out.println(enc[1]);
        //text/html;charset=UTF-8/text/html;charset=euc-kr
        //System.out.println("ContentType :"+);
        
        // �ش� �ʵ��� content-length�� ���� value�� �٤�ȣ���� 
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
        // -- ** : �ȵ���̵� �Ҷ� ���ô�.
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, enc[1]));
        String res =  null;
        while ((res = br.readLine()) != null) {            
            System.out.println(res);
        }
        // �ڿ� �ݱ� try catch finally\
        // �������� : ����ڰ� �Է��� url�� �ҽ���
        // jTextArea�� ����ϰ� save��ư�� ������ 
        // ����ڰ� ������ ��ο� ���� �̸����� �����ϴ� ����� �����Ͻÿ�,
    }
}
