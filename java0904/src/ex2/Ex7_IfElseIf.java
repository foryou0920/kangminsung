package ex2;

import java.util.Scanner;

public class Ex7_IfElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = sc.nextLine();
        if (msg.equalsIgnoreCase("red")) {
            System.out.print("�������̱���");
        } else if (msg.equalsIgnoreCase("blue")) {
            System.out.print("�Ķ����̱���");
        } else if (msg.equalsIgnoreCase("green")) {
            System.out.print("����̱���");
        }else 
            System.out.print("�𸣰ڽ��ϴ�.");
        }
    }




