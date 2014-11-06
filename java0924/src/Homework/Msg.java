
package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Msg {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:\\kosta86\\javaStudy\\workSpace\\java0924\\src\\Homework\\NewClass.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println(prop.get("¾È³ç?"));
        
    }

}
