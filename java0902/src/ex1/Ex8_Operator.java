
package ex1;

import java.util.Scanner;

public class Ex8_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 :");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("수2 :");
        int num2 = Integer.parseInt(sc.nextLine());
        
        System.out.print("값크기 비교 :");
        System.out.println(">크기는" + (num1>num2));
        System.out.println("<크기는" + (num1>num2));
        System.out.println("*값은" + (num1*num2));
        System.out.println("/값은" + (num1/num2));
        System.out.println("%값은" + (num1%num2));
    }

}
