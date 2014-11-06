
package ex1;

import java.util.Scanner;

public class Ex7_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("수2 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println(num1+"+"+num2 + "="+(num1+num2  ));
        //입력받은 수가 짝수이면 true을 출력하시오
        System.out.print("짝수를 입력 :");
        int num3 =Integer.parseInt(sc.nextLine());
        System.out.println("판별 :" +(num3%2 ==0));

        }
    }
