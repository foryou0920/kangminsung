
package ex1;
// 연습문제
//start는 다른클래스와 공유해야될 자원이기 때문에 static으로 변경하고  
//thread가 수행될 일을 Ex3_MyThread에게 담당시켜서 사용해보자.
public class Ex3_ThreadSingle {
    public static long start;
    public static void main(String[] args) {
        
    start = System.currentTimeMillis();
       //--------------------thread가 수행
        Ex3_MyThread th = new Ex3_MyThread();
        th.start();
      
        //----------------------------------------------------
        for(int i=0; i<300; i++) { 
            System.out.print("X");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis()-start);
    }

}
