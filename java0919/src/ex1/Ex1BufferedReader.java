
package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1BufferedReader {
    public static void main(String[] args) throws IOException,FileNotFoundException{
      //BufferedReader�� 2�� Stream�̶� 
      // 1�� Stream�� FileInputStream�� �����Ҽ� ����
      // Bridge Stream�� InputStreamReader�� ���� 
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        (new FileInputStream("c:/kosta86/mytext.txt"))));
        String rv = null;
      
        while((rv = br.readLine()) != null) {  // br�� ���پ� �о��. 
            System.out.println(rv);
            
        }
        
        br.close();
       
    }
}
