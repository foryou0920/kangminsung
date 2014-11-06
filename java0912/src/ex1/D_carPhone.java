
package ex1;

public class D_carPhone extends Ex1_Super {
    private String pixel ;
    public D_carPhone(String model, String num,int chord,String pixel){
        this.pixel = pixel;
    // 부모의 자원을 참조하기 위해서 super란 키워드를 사용
        super.model = model;
    //부모의 자원이라고 해도 private는 접근이 불가능하다 
    //부모클래스에 정의 된 메서드도 자신의 자원처럼 호출가능
       setNumber(num);
       super.chord = chord;
       
        
        
    }

    public String getPixel() {
        return pixel;
    }

    }


// [연습문제] MP3Phone 클래스를 만들어서 Ex1_Super를 상속받고 
// 멤버필드위에는 int size // 저장용량 
// 하나두고 위와같이 초기화 시키시오
// 즉 Ex1_Super는 자식 클래스에 재사용이 되는 부모클래스로 설계되었다.

