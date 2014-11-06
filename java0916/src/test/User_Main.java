package test;

import java.util.ArrayList;
import java.util.Scanner;

public class User_Main {

    public static void main(String[] args) {
        ArrayList<User_Vo> ar = new ArrayList<User_Vo>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1- ȸ�������Է� , 2-ȸ������Ʈ��� , 3- ����:");
            int num = Integer.parseInt(sc.nextLine());

            if (num == 1) {
                System.out.println("������ ���� ȸ�������� �Է����ּ���");
                System.out.println("---------------------------------");
                User_Vo vo = new User_Vo();
                System.out.print("ȸ����ȣ :");
                vo.setNum(Integer.parseInt(sc.nextLine()));
                System.out.print("��    �� :");
                vo.setName(sc.nextLine());
                System.out.print("��    �� :");
                vo.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("�� �� �� :");
                vo.setWeight(Float.parseFloat(sc.nextLine()));
                System.out.print("�����ּ� :");
                vo.setEmail(sc.nextLine());
                System.out.print("�������� :");
                vo.setAgree(Boolean.parseBoolean(sc.nextLine()));
                ar.add(vo);

            } else if (num == 2) {
                System.out.println("---------------------------------");
                for (User_Vo a : ar) {
                    System.out.println("ȸ����ȣ :" + a.getNum());
                    System.out.println("��    �� :" + a.getName());
                    System.out.println("��    �� :" + a.getAge());
                    System.out.println("�� �� �� :" + a.getWeight());
                    System.out.println("�����ּ� :" + a.getEmail());
                    System.out.println("�������� :" + a.isAgree());

                    if (a.getAge() < 18) {
                        System.out.println("�̼����ڷ� ������ ��ƽ��ϴ�");
                    } else {
                        System.out.println("�����մϴ� ������ �Ϸ�Ǿ����ϴ�.");
                    }
                }

            } else if (num == 3) {
                System.out.println("�ý����� �����մϴ�");
                break;

            } else {
                System.out.println("�߸��Է��Ͽ����ϴ�");
            }
        }
    }
}
