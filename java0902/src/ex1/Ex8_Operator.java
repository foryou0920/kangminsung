
package ex1;

import java.util.Scanner;

public class Ex8_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��1 :");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("��2 :");
        int num2 = Integer.parseInt(sc.nextLine());
        
        System.out.print("��ũ�� �� :");
        System.out.println(">ũ���" + (num1>num2));
        System.out.println("<ũ���" + (num1>num2));
        System.out.println("*����" + (num1*num2));
        System.out.println("/����" + (num1/num2));
        System.out.println("%����" + (num1%num2));
    }

}
