package exam;
/**
 * @author kosta 
 * Document   : ExamStarMoon Created on : 2014. 9. 22, 오전 11:21:06
 */
public class ExamStarMoon extends Thread{

    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            try {
                Thread.sleep(1000);
                if(i % 2 == 0){
                    System.out.println("별");
                }else{
                    System.out.println("달");
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
           // System.out.print(i);
        }
        
    }
    public static void main(String[] args) {
        new ExamStarMoon().start();
    }
}
