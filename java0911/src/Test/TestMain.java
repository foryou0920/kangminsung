package Test;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        TestControl con = new TestControl();
        TestVO vo = new TestVO();
        Scanner sc = new Scanner(System.in);

        Test:
        while (true) {
            System.out.print("�Է�1, �Է�2, �Է�3 :");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("�̸� : ");
                    vo.setName(sc.nextLine());
                    System.out.print("���� : ");
                    vo.setAge(sc.nextLine());
                    System.out.print("�ּ� : ");
                    vo.setAdd(sc.nextLine());
                    System.out.print("���� : ");
                    vo.setJob(sc.nextLine());
                    System.out.print("���� : ");
                    vo.setTall(Integer.parseInt(sc.nextLine()));
                    break;

                case 2:

                    System.out.print("�̸� : ");
                    vo.setName(sc.nextLine());
                    System.out.print("���� : ");
                    vo.setAge(sc.nextLine());
                    System.out.print("�ּ� : ");
                    vo.setAdd(sc.nextLine());
                    System.out.print("���� : ");
                    vo.setJob(sc.nextLine());
                    System.out.print("���� : ");
                    vo.setTall(Integer.parseInt(sc.nextLine()));
                    con.info(vo);

                    break;

                case 3:
                    System.out.println("�����մϴ�");
                    break Test;

            }

        }
    }
}
