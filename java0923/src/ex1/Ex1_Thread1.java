

package ex1;


public class Ex1_Thread1 extends Thread {

    @Override
    public void run() {
       for(int i=0 ; i<300; i++) { 
           System.out.print("-");
       }
        System.out.print("");
    }


    public static void main(String[] args) {
      new Ex1_Thread1();
    }
    
}
