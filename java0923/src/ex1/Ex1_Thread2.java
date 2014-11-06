
package ex1;

public class Ex1_Thread2 implements Runnable{
    public void run() {
       for(int i=0 ; i<300; i++) { 
           System.out.print("|");
       }
        System.out.print("");
}
}
