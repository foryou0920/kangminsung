package ex2;
/**
 * @author kosta 
 * Document   : Main Created on : 2014. 9. 15, ���� 7:36:07
 */
public class Main {
    public static void main(String[] args) {
        // �θ� �����ؼ� �ڽ��� ������ ���
        Super ref = new SubA();
        ref.testMethod();
        // �ڽ��� ���� �ڿ��� �θ� ������ ���� ref�δ� ������ �� ����
        // ref.testMethod()�� �θ� ������ �ִ� �߻� �޼����̱� ������
        // ���� �ڽ����� ���� �������� ������ ������
        // �θ��� testMethod()�� ȣ���߾ �������̵��� �ڽ��� �켱���� 
        // �ִ�.
        //ref.myMethod();
        System.out.println("-----------------------------------");
        SubA ref2 = new SubA();
        ref2.myMethod(); // �ڽ� 
        ref2.testMethod(); // �ڽ�
    }
}
