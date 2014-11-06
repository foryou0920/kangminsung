
package ex1;

import static ex1.Ex3_ThreadSingle.start;

public class Ex3_MyThread extends Thread {

    @Override
    public void run() {
        for(int i=0; i<300; i++) { 
           System.out.print("*");
       }
        System.out.println("");
        System.out.println(System.currentTimeMillis()-Ex3_ThreadSingle.start);
    }
    
}
