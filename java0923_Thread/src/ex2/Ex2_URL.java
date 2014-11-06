package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author kosta 
 * Document   : Ex2_URL Created on : 2014. 9. 23, ���� 3:02:10
 */
// Uniform Resource Locator 
// ���ͳݿ��� ���� ������ �ڿ�(Resource)�� �ּҸ� ǥ���� �� �ִ� ���� ***
public class Ex2_URL {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1634&pageNum=1#a");
        System.out.println(url.getPath());//clazzregister/clazzRegister_findClazzWithContents
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getContent());

        System.out.println(url.getRef()); // a
        InputStream is = url.openStream();
        // -- ** : �ȵ���̵� �Ҷ� ���ô�.
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, "UTF-8"));
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
