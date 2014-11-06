
package ex1;

public class Ex2_ThreadLifeStack extends Thread {

    @Override
    public void run() {
        showStack();
    }
    
    public void showStack() { 
        try {
            throw new InterruptedException(); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) { 
//메인스택에서 start호출후 별도의 스택에서 메서드가 수행되는 것을 확인할수 있다
        new Ex2_ThreadLifeStack().start();
    }
    

}
