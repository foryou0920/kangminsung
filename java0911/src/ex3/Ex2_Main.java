
package ex3;

import java.util.Scanner;

public class Ex2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��ȣ�Է� :");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("�̸��Է� :");
        String name = sc.nextLine();
        System.out.println("�����Է� :");
        String age = sc.nextLine();
        System.out.println("�����Է� :");
        String gender = sc.nextLine();
        System.out.println("��ȭ��ȣ �Է� :");
        String tel = sc.nextLine();
        
        Ex2_CallByReference ref = new Ex2_CallByReference();
        ref.info(num, name, age, gender, tel);
        //���Ŭ���� ����
        
        System.out.println("�Է��Ͻ� ���� :");
        System.out.println("��ȣ :" +ref.getNum());
        System.out.println("�̸� :" +ref.getName());
        System.out.println("���� :" +ref.getAge());
        System.out.println("���� :" +ref.getGender());
        System.out.println("��ȭ��ȣ :"+ref.getTel());
        
    }

}
