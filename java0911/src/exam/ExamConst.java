package exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamConst {

    private String name;
    private int age;
    private String date;

    // ������ �����ϵ��� �����غ��� , ��簪�� �����ڸ� ���ؼ� ���� �ʱ�ȭ
    //���Ѻ���
    //��ü�� �����ϱ� ���� �پ��� ����� �����ε����� ��������� �Ѵ�.
    public ExamConst(String name) {
        this.name = name;
        age = 19;
        date = new SimpleDateFormat("yyyy-mm-dd").format(new Date());
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        date = f.format(d);
    }

    public ExamConst(int age) {
        this.age = age;
    }

    public ExamConst(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean insert(String name, int age) {
        if (age > 19) {
            System.out.println(name + "�� ���");
            return true ;
        } else {
            System.out.println(name + "�� ���ٱ���");
            return false;
        }
    }

    boolean insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
