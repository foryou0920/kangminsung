package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta 
 * Document   : Ex2_ThreadStack Created on : 2014. 9. 22, ¿ÀÀü 10:48:23
 */
public class Ex2_ThreadStack extends Thread{
    @Override
    public void run() {
        showStack();
    }
    public void showStack(){
        try {
            throw new InterruptedException();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex2_ThreadStack().start();
    }
}
