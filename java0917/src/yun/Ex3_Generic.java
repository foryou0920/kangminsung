package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author kosta
 * Document : Ex3_Generic Created on : 2014. 9. 16, ���� 3:31:48
 */

// jdk5���� ��ü ���� ĳ���� ������ �ذ��ϱ� ���ؼ� �����÷����� ����
public class Ex3_Generic 
{
    private void checkAge(int age) throws WrongAgeException{
        if(age<0){
            throw new WrongAgeException("�߸��� �����Դϴ�.");
        }
    }
    
    public static void main(String[] args) {
        // vector�� arraylist�� ���.. ���̴� ����ȭ ���� ����
        // vector�� ����ȭ�� ������ ������ �ٸ� �κ����� ��ü�� ����(������� �����ִ�) // ����ȭ ���θ� ��� �˻���.. ����ȭ ���� �� �ϸ� ���� ����
        // ����ȭ��..? �ڿ��� ������ ���..
        // Generic - String�� ���� �� �ִ� ArrayList
        ArrayList<String> str = new ArrayList<>();  // �� ������ jdk7���� ����� ���. 6 ���Ͽ����� ����        
        str.add("ok");
        str.add(String.valueOf(10));    // �׳� 10�� ��θ� vector�ʹ� �ٸ��� ������ �߻��Ѵ�
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for(String e:str){
            System.out.println(e);
        }
        System.out.println("-----------Iterator---------");
        // Iterator it = str.iterator();   // �̰� jdk �������� ���ư��ڴ� ������ �ڵ���
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(Integer.parseInt("20"));
        Iterator<Integer> it2 = num.iterator();
        while(it2.hasNext()){
            Integer i = it2.next();
            System.out.println(i);
        }
        
        // ����] ArrayList�� ����ϴ� ���ϱ� �ű⿡ ȸ�������� �����ϰ� �ʹ�.
        // �ٵ� ���׸����� ǥ���Ǹ� ��� ���� �ٸ� �ڷ����� �־ ȸ�������� ������ �� ������?
        /*
                1-ȸ������ �Է�, 2-ȸ������Ʈ ���, 3-����
                ȸ����ȣ int
                ȸ���̸� String
                ������ float
                ���ǿ��� boolean
                �̸��� String
        
                �̷��� ȸ���� 5�� ���� �߰��ϰ�..
                ȸ�� ���� ��� �� �̼����� Ȥ�� �������� ��� --- [�̼�����] / ���� ---- �̷���
        
        [����] - A�� ������ : ArrayList�� ������ ȸ������
        */
        
        int idx;
        Scanner sc = new Scanner(System.in);
        ArrayList<Info> ar = new ArrayList<>();
        Ex3_Generic g = new Ex3_Generic();
        
        out: while(true){
            System.out.println("1.ȸ�� ���� �Է�  2.ȸ�� ����Ʈ ���  3.����");
            System.out.print("����: ");
            idx = Integer.parseInt(sc.nextLine());
            switch(idx){
                case 1:
                    try {
                        Info temp = new Info();
                        System.out.print("��ȣ: ");
                        temp.setNum(Integer.parseInt(sc.nextLine()));
                        System.out.print("�̸�: ");
                        temp.setName(sc.nextLine());
                        System.out.print("������: ");
                        temp.setWeight(Integer.parseInt(sc.nextLine()));
                        System.out.print("���ǿ���: ");
                        temp.setAgree(Boolean.getBoolean(sc.nextLine()));
                        System.out.print("�̸���: ");
                        temp.setMail(sc.nextLine());
                        System.out.print("����: ");
                        int age = Integer.parseInt(sc.nextLine());
                        temp.setAge(age);
                        g.checkAge(age);
                        ar.add(temp);
                        System.out.println("�Է� ����");
                    } catch (NumberFormatException e) {
                        System.out.println("�� �ڷ����� �´� ������ �Է����ּ���...");
                    } catch (WrongAgeException e) {
                        System.out.println(e.getMessage());
                    } finally{
                        System.out.println("-----------------------");
                    }
                    break;
                case 2:
                    if(ar.isEmpty()){   
                        System.out.println("ȸ���� �����ϴ�.");
                        break;
                    }
                    for(Info e:ar){
                        System.out.println("��ȣ: "+e.getNum());
                        System.out.println("�̸�: "+e.getName());
                        System.out.println("������: "+e.getWeight());
                        System.out.println("���ǿ���: "+e.isAgree());
                        System.out.println("�̸���: "+e.getMail());
                        System.out.println("����: "+e.getAge());
                        System.out.println("-----------------------");
                    }
//                    Iterator<Info> temp = ar.iterator();
//                    while(temp.hasNext()){
//                        
//                    }
                    break;
                case 3:
                    System.out.println("�����մϴ�.");
                    break out;
                default:
                    System.out.println("�˸��� �޴��� �������ּ���.");
            }
        }
    }
}
