package exam;

import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է� :");
        int a = Integer.parseInt(sc.nextLine());
        String msg = "";
        if (a % 2 == 0) {  // ���� a�� 2�� ���� ���������� 0�ΰ�� ¦��
            msg = "¦��";
        } else {
            msg = "Ȧ��";
        }
        System.out.print("�Է��� �� [" + a + " ]��" + msg + " �Դϴ�.");

    }

}
