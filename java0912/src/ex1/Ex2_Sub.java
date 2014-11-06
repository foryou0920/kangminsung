
package ex1;

public class Ex2_Sub extends Ex2_Super{
    // 상속받은 부모클래스의 기본생성자가 없을때 
    // 자식클래스의 기본생성자가 있다면 super();가 생략되어 있기 때문에 
    // 부모클래스의 기본생성자를 호출하기 때문에 오류가 난다
    // 아래처럼 해결가능
    
   public Ex2_Sub(int num) { 
        super(10);
   }

}
