
package ex1;

//쓰레드의 생명주기 3가지 

import java.util.logging.Level;
import java.util.logging.Logger;

//new : 쓰레드가 만들어진 상태(thread th = new thread())
//Runnable : 실행가능한 상태(th.start() 메서드를 호출한 상태), 이때 
//JVM의 스케줄러는 해당운영체제의 스케줄러에게 자원을 할당 받기 위해서 
//요청한상태 
//Running : 실행상태(run() 메서드를 실행한 상태)

//thread의 생명주기
//new - > Runnable -> Running -> Dead(종료)_ Run메서드가 종료된 상태
//Running -> -> Dead(종료)
//쓰레드가 특정한 이유로 Running상태에서 blocked상태로 이동 
//동기화블록,I/O Request등을 수행할때 이동됨 
//위의 조건이 만족이 될때(모든수행이 끝났을때까지) 계속 유지됨

// Thread(Runnable target) 
// Allocate a new Thread object

public class Ex1_MyThread extends Thread {
    //쓰레드에게 일을 시켜보자. 
    //run()은 , run2()처럼 throws를 던질수 없는 이유는? 
    //>>thread를 상속받았기 때문에 run은 개발자인 본인이 
    //쓰레드에게 일을 시키기 위해서 재정의해서 사용하는 메서드이다. 
    
    
    @Override
    public void run() {
        super.run(); 
        for(int i=0; i<=10; i++) { 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(i);
            
        }
    }
}