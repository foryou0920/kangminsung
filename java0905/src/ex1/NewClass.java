
package ex1;
//���� Ŭ������ ����, ����, ����� ����ȸ�翡�� ����ϴ� 
//������ �ʿ��� �ڵ���
//A����B���� �����ڵ忡�� �����ؼ� �۾��� �Ҽ� �ִµ� 
//�ݾ��� ������ ���� A���� �����ϰ� �Ϸ���?

public class NewClass {
    
    
    public void insertPay(int p,String str){
        if(str.equals("dd")) { 
            System.out.println("����� ���� ������ �����ϴ�.");
            System.exit(0); // �ý��� ����
            
        }
        pay = p; // ȣ��� ���� 1000���� ����ʵ忡 �����س��ڴ�.
    }
    private int pay;
    public int getPay(){
        return pay;
    }

}
