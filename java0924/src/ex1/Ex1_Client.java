package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_Client {

    private Socket s;
    private HashMap map;
    Ex1_Client() {
        
        HashMap map = new HashMap(); 
        map.put("안녕", "안녕못해!");
        map.put("점심", "지금이 몇시니??");
        map.put("뭐하고있어?", "몰라도돼");
        try {
            s = new Socket("192.168.7.149", 8989);
            InputStream is = s.getInputStream();// 받다
            OutputStream os = s.getOutputStream();//보내다
            //한줄단위로 받고 싶을때 
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //한줄단위로 보내고 싶을때 

            PrintWriter pw = new PrintWriter(new BufferedOutput Stream(os), true);
            //클라이언트는 서버로 요청을 보내는 작업
            pw.println("배고프네요");
            String ms = br.readLine();
            System.out.println(ms);
        } catch (IOException ex) {

        }
    }

    public static void main(String[] args) {
        new Ex1_Client();
    }

}
