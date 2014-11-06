package exam;

public class Ani_Main {

    public static void main(String[] args) {
        Animal[] ani = new Animal[3];

        ani[0] = new Bird();
        ani[1] = new Dog();
        ani[2] = new Cat();
        // instanceof : 왼쪽의 객체가 오른쪽에 명시한 클래스로부터 
        // 생성된 객체(가족관계 객체인지를) 인지를 비교해주는 예약어
       
        Animal ref1 = new Cat(); //인터페이스
        Dog ref2 = new Dog(); // 객체생성
        Bird ref3 = new Bird();
        
        System.out.println(ref1 instanceof Animal2);
        System.out.println(ref2 instanceof Animal2);
        System.out.println(ref3 instanceof Animal2);
   
        for(Animal e : ani) { 
            e.cry();
        }
    }


}
