
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
//���ν��ÿ��� startȣ���� ������ ���ÿ��� �޼��尡 ����Ǵ� ���� Ȯ���Ҽ� �ִ�
        new Ex2_ThreadLifeStack().start();
    }
    

}
