
package ex1;

import java.util.Scanner;


public class Ex1_Oper {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("���ڸ� �Է��ϼ���(a) :");
       int a =Integer.parseInt(sc.nextLine());
        System.out.print("���ڸ� �Է��ϼ���(b) :");
       int b= Integer.parseInt(sc.nextLine());
       
       boolean c = a<b; // ���� a�� ����b���� �۴�.
        System.out.println("a<b:" +c);
        c = a!=b; // ���� a��b�� ���� �����ʴ�.
        System.out.println("a!=b:" +c);
    }
    
}
