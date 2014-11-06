package ex2;
/**
 * @author kosta 
 * Document   : SubA Created on : 2014. 9. 15, 오후 7:34:19
 */
public class SubA extends Super{
    // 추상 클래스가 가지고 있는 추상메서드는 상속받으려면
    // 반드시 재정의 해야 한다.
    @Override
    public void testMethod() {
        System.out.println("부모의 메서드를 재정의해서 사용!");
    }
    public void myMethod(){
        System.out.println("이것은 순수한 subA의 전용메서드");
    }
}
