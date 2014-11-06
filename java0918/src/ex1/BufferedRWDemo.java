package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedRWDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력내용 :");
        String content = sc.nextLine();

        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            //new FileWriter("c: \\ kosta86\\mytext",true
            String path = "c:\\kosta86\\mytext.txt";
            bw = new BufferedWriter(new FileWriter(path,true));
            bw.write(content + "\n\n");
            bw.flush();
            System.out.println("작성하기 완료!");
            System.out.println("===================================");
            br = new BufferedReader(new FileReader(path));
            String rv = null;

            while ((rv = br.readLine()) != null) {
            }

        } catch (IOException ex) {

        }

    }
}
