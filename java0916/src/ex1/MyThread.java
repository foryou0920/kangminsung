
package ex1;

public class MyThread {
    public MyThread() { 
        for(int i =0; i<10; i++) { 
            try{ 
                // 일반적인 예외는 반드시 컴파일단계에서 점검함!
                Thread.sleep(1000);
                System.out.println(i);
            } catch(InterruptedException ex) { 
                ex.printStackTrace();
            }
        }
    }

}
