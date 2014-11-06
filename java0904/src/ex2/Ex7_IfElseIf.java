package ex2;

import java.util.Scanner;

public class Ex7_IfElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = sc.nextLine();
        if (msg.equalsIgnoreCase("red")) {
            System.out.print("빨간색이군요");
        } else if (msg.equalsIgnoreCase("blue")) {
            System.out.print("파란색이군요");
        } else if (msg.equalsIgnoreCase("green")) {
            System.out.print("녹색이군요");
        }else 
            System.out.print("모르겠습니다.");
        }
    }




