package ex2;
/**
 * @author kosta 
 * Document   : Main Created on : 2014. 9. 15, 오후 7:36:07
 */
public class Main {
    public static void main(String[] args) {
        // 부모를 참조해서 자식을 생성한 경우
        Super ref = new SubA();
        ref.testMethod();
        // 자식의 전용 자원은 부모를 참조한 변수 ref로는 접근할 수 없고
        // ref.testMethod()는 부모가 가지고 있는 추상 메서드이기 때문에
        // 오직 자식으로 부터 구현력을 가지기 때문에
        // 부모의 testMethod()를 호출했어도 오버라이딩된 자식의 우선권이 
        // 있다.
        //ref.myMethod();
        System.out.println("-----------------------------------");
        SubA ref2 = new SubA();
        ref2.myMethod(); // 자식 
        ref2.testMethod(); // 자식
    }
}
