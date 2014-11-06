
package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1BufferedReader {
    public static void main(String[] args) throws IOException,FileNotFoundException{
      //BufferedReader은 2차 Stream이라 
      // 1차 Stream인 FileInputStream에 연결할수 없다
      // Bridge Stream인 InputStreamReader로 연결 
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        (new FileInputStream("c:/kosta86/mytext.txt"))));
        String rv = null;
      
        while((rv = br.readLine()) != null) {  // br을 한줄씩 읽어낸다. 
            System.out.println(rv);
            
        }
        
        br.close();
       
    }
}
