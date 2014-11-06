package Homework;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    private Socket soc;
    private BufferedReader br;
    private PrintWriter pw;

    public BufferedReader getBr() {
        return br;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public Client() throws IOException {

        try {
            soc = new Socket("192.168.7.68", 7888);
            InputStream is = soc.getInputStream(); // 소켓을 받음
            OutputStream os = soc.getOutputStream();

            br = new BufferedReader(new InputStreamReader(is));
            pw = new PrintWriter(new BufferedOutputStream(os), true);

        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

}
