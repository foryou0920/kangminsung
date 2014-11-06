package ex1;

import java.util.Scanner;

public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է� :");
        try {
            int num = Integer.parseInt(sc.nextLine());
            int com = (int) (Math.random() * 3);

            int res = num / com;
            System.out.println("��µ� ��� : " + res);
//            System.out.println("�ڿ��ݳ�!");

        } catch (NumberFormatException e) {
            System.out.println("���ڸ� �Է�");
            return;
        } catch (ArithmeticException e) {
            System.out.println("0���� ������ �����ϴ�");

        } catch (Exception e) {
            //�������ܰ�ü�� �׻� �Ʒ��� �;��Ѵ�.
            System.out.println("���ڸ� �ۼ�");
        } finally { //������ ����Ǵ� ����!
            System.out.println("������ ����Ǹ� , �ڿ��ݳ�");

        }

    }

}
