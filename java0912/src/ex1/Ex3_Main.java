
package ex1;

public class Ex3_Main {
    public static void main(String[] args) {
     // 자식을 참조해서 객체를 생성하는 경우 
        Ex3_Sub ref1 = new Ex3_Sub("30세", "김길동", 3000);
        ref1.subMethod();
        System.out.println(ref1.superMethod());
        ref1.superCar(); // 자식의 superCar(); 호출이 됨
        System.out.println("===========================================");
        //부모를 참조해서 객체를 생성하는 경우 
        Ex3_Super ref2 = new Ex3_Sub("31세","김일동",3100);
        
    }

}
