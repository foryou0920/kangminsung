
package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Ex3ObjectOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {     
        String path = "c:/kosta86/mytest.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //������ ��ü ���� �� ������
        MemberVO v = new MemberVO();
        v.setName("��浿");
        v.setAge(30);
        v.setAddr("����");
        v.setFlag(true);
        //��Ʈ���� ���ؼ� ��ü�� ����(������ - ����ȭ)
        v.setTime(System.currentTimeMillis());
        oos.writeObject(v);
        
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        MemberVO v1 = (MemberVO) ois.readObject();
        System.out.println("Name :" +v1.getName());
        System.out.println("age :" +v1.getAge());
        System.out.println("addr : " +v1.getAddr());
        System.out.println("flag :" +v1.isFlag());
        System.out.println("�ҿ�ð� :" + (System.currentTimeMillis() - v1.getTime()));
        
        
    }
          
}
