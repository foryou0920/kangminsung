
package ex3;
// �������̽��� ����ϴ� Ŭ������ implements��� Ű����� �������̽��� 
// �����ؼ� �߻�޼��带 ������ �ؾߵ� ������ �ִ�.
public class InterTestEx implements InterFaceTest {
    public int getA() { 
        return A;
    }
    public int getB() { 
        return b; 
        
    }
public static void main(String[] args) { 
    InterTestEx it1 = new InterTestEx();
    System.out.println("A�� ��:" +it1.getA()); // 100
    System.out.println("A�� ��:" +it1.getB()); // 200
}
    
}
