
package ex1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex1BufferedWriter {
    public static void main(String[] args) throws IOException {
       //���� ��Ʈ���� ����Ʈ ��Ʈ������ ����
        //�긴�� ��Ʈ���� �����ؼ� ����ؾ� �Ѵ�.
        //OutputStreamWriter(byteStream.encoding);
        
        BufferedWriter bw =  new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:/kosta86/test.txt"),"euc-kr"));
       
        
        bw.write("�̰��� �׽�Ʈ�Դϴ�.");
        bw.flush(); //���ͺ��
        //���� �� Ȯ��
        

    }

}
