
package ex1;

import java.util.Scanner;

public class Ex6_Operator {
    public static void main(String[] args) {
            //Ŭ������ ����ϱ� ���ؼ��� ctrl + space
    Scanner sc = new Scanner(System.in);
    //UI ���ڸ� �Է��ϼ���.
   System.out.print ("�޼��� �Է�  :" );
    //����ڷκ��� ���ڿ��� �Է� ������ String msg�� �����ϱ� 
   // sc.nextLine()�� �޼��尡 ȣ���� �Ǹ� String���� ��ȯ�Ǳ� ������
   //�Ʒ��� ���� ���� Ÿ���� ������ �����ؼ� ���ɼ� �ֵ�
  // �޼��� �м�) �Է¹��� ���ڿ��� ���� ������ �о String���� ��ȯ�Ѵ�.
    String msg = sc.nextLine();
    System.out.print("�޽��� �Է�2 :");
    String msg2 = sc.nextLine();
    
    System.out.println("======================== ");
    System.out.print("�Է°�1 : "+msg);
    System.out.print("�Է°�2 : "+msg2);
        System.out.println("msg/msg2�� ��:" +(msg.equals(msg2)));
     String svc1 = new String("MyTest");
     String svc2 = "MyTest";
        System.out.println("svc1/svc2 �� : " +(svc1.equals(svc2)));
     
      
    }
  
}
