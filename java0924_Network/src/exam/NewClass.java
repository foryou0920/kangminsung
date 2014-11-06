package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author kosta 
 * Document   : NewClass Created on : 2014. 9. 24, 오후 1:44:29
 */
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         String path ="C:\\kosta86\\javaStudy\\workspace\\java0924_Network\\src\\exam\\msg.properties";
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println(prop.get("배고파"));
    }
}
