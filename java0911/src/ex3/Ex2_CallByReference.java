
package ex3;

public class Ex2_CallByReference {
//    �������� : ����Ŭ������ ��ȭ�� �������� ���� Ŭ������ ���谡 �Ǿ��ִ�.
//               info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���� 
//               �޼����� ���ڰ��� �ÿ����ϰ� , ����ʵ� �� setter/getter�� �÷����Ѵ�.
//               private boolean agree�� �߰��ؼ� ����غ��� �˰���
//               POJO , CallByReference�� ������ ����ϸ� �ذ��
    

    public Ex2_CallByReference() {
    }
    
    private int num;
    private String name,age,gender,tel;
    /** this : ���簴ü�� �ּҰ� - ���������� ����ʵ尡 �̸��� ������ 
     ���������� �켱������ �ִ�.
     �ѻ���� ������ ��� (�̸�,����,����,��ȭ��ȣ,��ȣ)
     �̷��� �����ϱ� ���� �̸��� �޸� �ְų� , this�� Ű���带 
     �ٿ��ָ� �ȴ�. �������� ��ü�� �ּ�,����ڿ�(this.num)�� ���·� ���� */
    public void info(int num, String name, String age , String gender , String tel) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
        
//        System.out.println("�Է��Ͻ� ���� :");
//        System.out.println("��ȣ :" +num);
//        System.out.println("�̸� :" +name);
//        System.out.println("���� :" +age);
//        System.out.println("���� :" +gender);
//        System.out.println("��ȭ��ȣ :" +tel);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getTel() {
        return tel;
    }


}
