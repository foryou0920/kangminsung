
package ex1;

import java.util.Scanner;


public class Ex1_Oper {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요(a) :");
       int a =Integer.parseInt(sc.nextLine());
        System.out.print("숫자를 입력하세요(b) :");
       int b= Integer.parseInt(sc.nextLine());
       
       boolean c = a<b; // 변수 a가 변수b보다 작다.
        System.out.println("a<b:" +c);
        c = a!=b; // 변수 a와b가 서로 같지않다.
        System.out.println("a!=b:" +c);
    }
    
}
