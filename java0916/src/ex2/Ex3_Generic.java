package ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3_Generic {
// jdk5���� ��ü���� ĳ���� ������ �ذ��ϱ� ���ؼ� 
// �����÷����� ����

    public static void main(String[] args) {
        // Vector �� ArrayList ���̴� ����ȭ ��������!
        // Vector�� ����ȭ�� �����ϴ� ����� ������ �ٸ��κ����� ��ü����
        //
        ArrayList<String> str = new ArrayList<String>();
        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for (String e : str) {
            System.out.println(e);

        }
        System.out.println("iterator---------------------------");
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(Integer.parseInt("10"));
        //[����] ArrayList�� ����ϴ� ���ϱ� 
        //ȸ�������� �����ϰ� �;�� �ٵ� ���׸����� ǥ���Ǹ� 
        // ��� ���� �ٸ��ڷ������� �־ ȸ�������� �����Ҽ� �������??
        //����ȭ�� 
        //@ 1- ȸ�������Է� , 2-ȸ������Ʈ��� , 3- ����:1
        //  ȸ������(int);
        //  ȸ���̸�(String);
        //  ȸ��������(Float);
        // ȸ���� ���ǿ���(boolean);
        // ȸ���� �̸���(string)
        // ȸ���� ����(int);
        // 1- ȸ�������Է� , 2-ȸ������Ʈ��� , 3- ����: 2
        //  ȸ����ȣ:1 
        //  �̸�: �̼���
        //  ������: 60.5kg
        //  ���ǿ���: false
        //  �̸��� : a@aa.com
        //  ����   : 18 (18�� �̸��ϰ�� "�̼�����" , "����")
        //[����] - A�� ���μ� : ArrayList�� ������ ȸ������
    }

}
