package ex1;

public class Ex1_Join {

    private static long startTime = 0;

    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); //t1의 작업이 끝날때까지 다른 쓰레드는 대기

        Ex1_Thread2 t2 = new Ex1_Thread2();
        Thread tt2 = new Thread(t2);
        tt2.start();
        t1.join();
        // Runnable 인터페이스를 구현한 클래스는 run만 추상메서드로 제공하기때문에 
        // start()메소드를 제공하지 않는다.
        // run을 호출한다는 개념은 쓰레드에다 일을 시키겠다는게 아니라 
        // 결국 쓰레드를 호출하려면 start를 호출
        // main에서 run()을 직접 호출하는 경우 main이 직접 처리하는 것이므로 
        // 다른쓰레드가 아니다. 
        // 쓰레드 생성방법 >> 상속 ,인터페이스 
        // 인터페이스 구현시 쓰레드를 생성해서 
        // 쓰레드 생성자 인자에 runnable을 구현한 클래스의 주소값을 넘겨줘야  
        // start()를 제공 받을수 있다.

        System.out.println("걸린시간:" + (System.currentTimeMillis() - startTime));
    }

}
