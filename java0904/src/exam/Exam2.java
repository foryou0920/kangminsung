package exam;

import java.util.Scanner;

public class Exam2 {
    
    

    public static void main(String[] args) {
        //���� �Է��ϼ���  9
        //������ �Է��ϼ��� 3
        
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է��ϼ���:");
        int su = Integer.parseInt(sc.nextLine());

        System.out.print("������ �Է��ϼ���:");
        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= su; i++) {

            if (i % range == 0 && i != 0) {

            System.out.println("   ");

            }
            System.out.print(i + "\t");
        }
    }
}
