package ex1;



public class Exam_star extends Thread{

    @Override
    public void run() {
       for(int i =0; i<100; i++) { 
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
               e.printStackTrace();
           }
           if( i % 2 ==0) { 
               System.out.println("a");
           } else{
               System.out.println("b");
       }
     
       }
    }
    public static void main(String[] args) {
        System.out.println("메서드 수행"); 
        new Exam_star().start();
        System.out.println("메서드 끝");
    }
    
    
    
}
