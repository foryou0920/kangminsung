
package ex3;


public class Ex_Constructor {
    
    private String msg ; 
public Ex_Constructor(String msg) { 
    this.msg = msg ;
    //�����ϴ�� > JVM����
    //�����ڰ� �����ڸ� ���� ���� �ص��� ������ �����Ϸ��� 
    //�⺻�����ڸ� �����صд�
    //�����ڴ� Ŭ������� ���� ��ȯ���� ����.
    //���� : ����Ŭ������ �ʱ�ȭ ��Ű�°��� �����̴�.
    
    // ����Ŭ������ ���� �����Ҽ� �մ� ���,�޼���(setter),�����ڻ�
}
    public static void main(String[] args) {
        Ex_Constructor con = new Ex_Constructor("����");
        con.test();
    }
        private void test() { 
            System.out.println("�׽�Ʈ!!");
        }
    }

