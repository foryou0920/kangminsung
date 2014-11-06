
package ex1;

public class Ex1_RoboMain {
    //Ex1_Robo.class 받아서 개발하기 위한 작업 
    public static void main(String[] args) {
        // 참조자료형 Ex1_Robo ref; 선언
        // new 연산자를 사용해서 Ex1_Robo() Heap영역에 생성
        
        Ex1_Robo ref = new Ex1_Robo();
        ref.power = true; // 힙영역에 있는 Ex1_Robo객체의 자원인 power에 
        // true값을 저장한상태
        // 그후 ref.isPower() 메서드를 호출하면 당연히 true값을 가지고 있는
        // power값인것을 확인할수 있다.
        
                
        if(ref.isPower() == true){
            System.out.println("로보의 전원이 켜졌습니다.");
            
        }else { 
            System.out.println("로보의 전원이 꺼졌습니다.");
        }
        boolean rv = ref.move(10); 
        if(!rv){
        System.out.println("로봇 동작에 문제가 있습니다.");
    }
    }
}
