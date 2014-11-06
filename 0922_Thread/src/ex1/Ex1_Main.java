package ex1;
/**
 * @author kosta 
 * Document   : Ex1_Main Created on : 2014. 9. 22, 오전 10:34:29
 */
// 스레드의 생명주기가 있기 때문에 스레드는 다시 재사용 될 수 없다.
// 하나의 스레드에 하나의 start()만 호출
public class Ex1_Main {
    public static void main(String[] args) {
        System.out.println("메인 메서드 수행 시작!");
        Ex1_MyThread t1 = new Ex1_MyThread(); // 1 , 1
        // Ex1_MyThread에 있는 run()메서드를 
        // 하나의 스택에서 호출한 것뿐임
        //t1.run();  // 2 
        //-------------------------------
        // 운영체제의 스케줄러로 부터 요청하기 때문에
        // 언제 어떻게 수행될지 모름.
        t1.start(); // 수행
        t1 =  new Ex1_MyThread();
        t1.start(); // 오류가 나는 이유 지금까지 배운내용으로..잘정리..
        System.out.println("메인 메서드 수행 끝!"); // 대기 , 2
    }
}
