package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta 
 * Document   : Ex1_MyThread Created on : 2014. 9. 22, 오전 10:06:55
 */
//스레드의 생명주기 3가지
// New : 스레드가 만들어진 상태 (Thread th = new Thread())
// Runnable : 실행가능한 상태(th.start() 메서드를 호출한 상태), 이때
// JVM의 스케줄러는 해당 운영체제의 스케줄러에게 자원을 할당 받기 위해서
// 요청한 상태
// Running : 실행 상태 (run() 메서드를 실행한 상태)

// Thread의 생명주기 
// 1. New -> Runnable -> Running -> Dead(종료)
// 2. Running -> Blocked ->Dead(종료- run메서드가 종료된 상태)
// 스레드가 특정한 이유로 Running 상태에서 Blocked 상태로 이동
// 동기화블록, I/O Request 등을 수행할때 이동됨
// 위의 조건이 만족이 될때(모든 수행이 끝났을 때) 까지 계속 유지됨

// Thread를 생성하는 방법 중, 상속
public class Ex1_MyThread extends Thread{
// run()은 , run2() 처럼 throws 를 던질수 없는 이유는?
    // Thread를 상속받았기 때문에 run은 개발자인 본인이 
    // 스레드에게 일을 시키기 위해서 재정의해서 사용하는 메서드이다.
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print(i);
        }
    }
 
}
