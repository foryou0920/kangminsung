
package ex1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex1BufferedWriter {
    public static void main(String[] args) throws IOException {
       //문자 스트림을 바이트 스트림으로 연결
        //브릿지 스트림을 연결해서 사용해야 한다.
        //OutputStreamWriter(byteStream.encoding);
        
        BufferedWriter bw =  new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:/kosta86/test.txt"),"euc-kr"));
       
        
        bw.write("이것은 테스트입니다.");
        bw.flush(); //버터비움
        //저장 후 확인
        

    }

}
