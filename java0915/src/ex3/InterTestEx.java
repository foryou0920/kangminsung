
package ex3;
// 인터페이스를 사용하는 클래스는 implements라는 키워드로 인터페이스를 
// 구현해서 추상메서드를 재정의 해야될 목적이 있다.
public class InterTestEx implements InterFaceTest {
    public int getA() { 
        return A;
    }
    public int getB() { 
        return b; 
        
    }
public static void main(String[] args) { 
    InterTestEx it1 = new InterTestEx();
    System.out.println("A의 값:" +it1.getA()); // 100
    System.out.println("A의 값:" +it1.getB()); // 200
}
    
}
