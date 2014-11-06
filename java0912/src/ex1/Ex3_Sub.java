
package ex1;

public class Ex3_Sub extends Ex3_Super {
private String age;

    public Ex3_Sub(String age,String msg , int num) {
        super(num, msg);
        this.age = age;
    }

    public void subMethod() { 
        System.out.println("여기는 자식의 메서드 입니다.");
    }
     //어노테이션 : 실행 가능한 주석 / 여기서는 JVM이 Override라고 인식하는 
     // 키워드..
    @Override
    public void superCar() {
        System.out.println("나만의 자동차!");
    }
    
{

}
}
