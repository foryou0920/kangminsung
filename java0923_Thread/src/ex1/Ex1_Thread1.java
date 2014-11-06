package ex1;
/**
 * @author kosta 
 * Document   : Ex1_Thread1 Created on : 2014. 9. 23, ¿ÀÀü 9:06:57
 */
public class Ex1_Thread1 extends  Thread{

    @Override
    public void run() {
        for(int i=0; i<300; i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    
    
}
