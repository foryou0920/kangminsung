package ex2;

// 추상클래스의 추상메서드가 있다면 반드시 재정의 해서 사용해야 상속
// 받아서 추상클래스가 가지고 있는 다른자원(여기서는 1000억)을 사용할수 있음
// 즉 추상은 요구조건의 기준이 된다.
public class Ex1_AbstractMain extends Ex1_Abstract {

    @Override
    public void moveMount() {
        System.out.println("산을 옮겼음 " + getMoney() + "바았음 ㅎㅎ");
    }

    public static void main(String[] args) {
        Ex1_Abstract ref = new Ex1_AbstractMain();
        ref.moveMount();
       //부모의 메서드를 호출했지만 제정의(****)된 
        // 자식메서드가 호출이 됨
        // (정리)추상클래스는 독립적으로 new란 연산자로 생성되어서 
        // 사용될수 없기 때문에 미완성인 추상메서드로 정의 해두면 
        // 재정의된 자식에 의해서 완성이 되어서 사용이 됨 ** 6
    }
}
