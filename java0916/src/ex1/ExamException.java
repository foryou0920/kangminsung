package ex1;

import java.util.Scanner;

public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수입력 :");
        try {
            int num = Integer.parseInt(sc.nextLine());
            int com = (int) (Math.random() * 3);

            int res = num / com;
            System.out.println("출력된 결과 : " + res);
//            System.out.println("자원반납!");

        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력");
            return;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다");

        } catch (Exception e) {
            //상위예외객체가 항상 아래에 와야한다.
            System.out.println("숫자만 작성");
        } finally { //무조건 수행되는 개념!
            System.out.println("무조건 실행되며 , 자원반납");

        }

    }

}
