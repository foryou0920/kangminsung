package ex1;
/**
 * @author kosta 
 * Document   : Ex1_Join Created on : 2014. 9. 23, 오전 9:04:28
 */
// 현재 스레드가 무사히 종료될때 까지 다른 스레드가 대기 하도록 지정하는 
// 메서드
public class Ex1_Join {
    private static long startTime;
    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); // t1의 작업이 끝날때 까지 다른 스레드는 대기
        Ex1_Thread2 t2 = new Ex1_Thread2();
        Thread tt2 = new Thread(t2);
        tt2.start();
        tt2.join();
        System.out.println("걸린시간 :"+(System.currentTimeMillis() - startTime));
    }
}
