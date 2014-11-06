package ex1;

/**
 * @author kosta Document : Ex1_Thread2 Created on : 2014. 9. 23, ¿ÀÀü 9:09:19
 */
public class Ex1_Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("");
    }

}
