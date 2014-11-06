
package ex3;


public class Ex_Constructor {
    
    private String msg ; 
public Ex_Constructor(String msg) { 
    this.msg = msg ;
    //컴파일담계 > JVM실행
    //개발자가 생성자를 따로 정의 해두지 않으면 컴파일러가 
    //기본생성자를 정의해둔다
    //생성자는 클래스명과 같고 반환형이 없다.
    //목적 : 현재클래스를 초기화 시키는것이 목적이다.
    
    // 현재클래스에 값을 주입할수 잇는 방법,메서드(setter),생성자뿐
}
    public static void main(String[] args) {
        Ex_Constructor con = new Ex_Constructor("하이");
        con.test();
    }
        private void test() { 
            System.out.println("테스트!!");
        }
    }

