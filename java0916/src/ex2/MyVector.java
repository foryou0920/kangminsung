package ex2;

import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {
        //�÷����� �ڷᱸ���̰� ,��ü�������� ��!

        Vector v = new Vector();
        v.add(new String("Test"));
        v.add(10);
        v.add('A');
        v.add(true);
        v.add(3.14f);
        v.add(100L);
        System.out.println("������ ũ�� : " + v.size());

        for (Object e : v) {
            if (e instanceof String) {
                System.out.println("String :" + v);
            } else if (e instanceof Integer) {
                System.out.println("integer :" + v);
            }
            //vector�� ����� �� ��ü�� �ڷ����� ������ �̸����� ����ϱ� 

        }

    }
}
