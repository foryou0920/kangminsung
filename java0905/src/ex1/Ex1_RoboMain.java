
package ex1;

public class Ex1_RoboMain {
    //Ex1_Robo.class �޾Ƽ� �����ϱ� ���� �۾� 
    public static void main(String[] args) {
        // �����ڷ��� Ex1_Robo ref; ����
        // new �����ڸ� ����ؼ� Ex1_Robo() Heap������ ����
        
        Ex1_Robo ref = new Ex1_Robo();
        ref.power = true; // �������� �ִ� Ex1_Robo��ü�� �ڿ��� power�� 
        // true���� �����ѻ���
        // ���� ref.isPower() �޼��带 ȣ���ϸ� �翬�� true���� ������ �ִ�
        // power���ΰ��� Ȯ���Ҽ� �ִ�.
        
                
        if(ref.isPower() == true){
            System.out.println("�κ��� ������ �������ϴ�.");
            
        }else { 
            System.out.println("�κ��� ������ �������ϴ�.");
        }
        boolean rv = ref.move(10); 
        if(!rv){
        System.out.println("�κ� ���ۿ� ������ �ֽ��ϴ�.");
    }
    }
}
