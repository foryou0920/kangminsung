package ex1;
/**
 * @author kosta 
 * Document   : Ex1_Main Created on : 2014. 9. 22, ���� 10:34:29
 */
// �������� �����ֱⰡ �ֱ� ������ ������� �ٽ� ���� �� �� ����.
// �ϳ��� �����忡 �ϳ��� start()�� ȣ��
public class Ex1_Main {
    public static void main(String[] args) {
        System.out.println("���� �޼��� ���� ����!");
        Ex1_MyThread t1 = new Ex1_MyThread(); // 1 , 1
        // Ex1_MyThread�� �ִ� run()�޼��带 
        // �ϳ��� ���ÿ��� ȣ���� �ͻ���
        //t1.run();  // 2 
        //-------------------------------
        // �ü���� �����ٷ��� ���� ��û�ϱ� ������
        // ���� ��� ������� ��.
        t1.start(); // ����
        t1 =  new Ex1_MyThread();
        t1.start(); // ������ ���� ���� ���ݱ��� ��������..������..
        System.out.println("���� �޼��� ���� ��!"); // ��� , 2
    }
}
