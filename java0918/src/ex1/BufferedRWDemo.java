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
        System.out.println("�Է³��� :");
        String content = sc.nextLine();

        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            //new FileWriter("c: \\ kosta86\\mytext",true
            String path = "c:\\kosta86\\mytext.txt";
            bw = new BufferedWriter(new FileWriter(path,true));
            bw.write(content + "\n\n");
            bw.flush();
            System.out.println("�ۼ��ϱ� �Ϸ�!");
            System.out.println("===================================");
            br = new BufferedReader(new FileReader(path));
            String rv = null;

            while ((rv = br.readLine()) != null) {
            }

        } catch (IOException ex) {

        }

    }
}
