package exam;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 :");
        int a = Integer.parseInt(sc.nextLine());
        String msg = "";
        if (a % 2 == 0) {  // 변수 a를 2로 나눈 나머지값이 0인경우 짝수
            msg = "짝수";
        } else {
            msg = "홀수";
        }
        System.out.print("입력한 수 [" + a + " ]은" + msg + " 입니다.");

    }

}
