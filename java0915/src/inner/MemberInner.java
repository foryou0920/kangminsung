package inner;
//내부클래스 : 특정클래스 안에 또 다른 클래스가 정의되는것을 의미한다 
//종류 ㅣ 멤버,로컬,static,익명

import exam.Animal2;


public class MemberInner {

    private int a = 10;
    private int b;
    private int c;

    public MemberInner() {
        b = 100;
        c = 200;
    }

    public class Inner extends Animal2{

        public void printData() {
            System.out.println("외부클래스의 private접근가능" + a);
            System.out.println("외부클래스의 private접근가능" + b);
            System.out.println("외부클래스의 private접근가능" + c);
        }

        @Override
        public String col() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }


//내부클래스를 생성한다
public static void main(String[] args) {
   // 외부클래스를 생성한다.
    
        MemberInner outer = new MemberInner();
   //외부클래스의 주소를 통해서 내부클래스를 생성 및 접근
        MemberInner.Inner inner = outer.new Inner();
        inner.printData();
        //연습문제.. 축약시켜보기 두줄로 
   
     MemberInner.Inner inner1 = new MemberInner().new Inner();
     inner1.printData();
}
}
