
package ex1;

public class Ex3_Sub extends Ex3_Super {
private String age;

    public Ex3_Sub(String age,String msg , int num) {
        super(num, msg);
        this.age = age;
    }

    public void subMethod() { 
        System.out.println("����� �ڽ��� �޼��� �Դϴ�.");
    }
     //������̼� : ���� ������ �ּ� / ���⼭�� JVM�� Override��� �ν��ϴ� 
     // Ű����..
    @Override
    public void superCar() {
        System.out.println("������ �ڵ���!");
    }
    
{

}
}
