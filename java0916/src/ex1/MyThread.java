
package ex1;

public class MyThread {
    public MyThread() { 
        for(int i =0; i<10; i++) { 
            try{ 
                // �Ϲ����� ���ܴ� �ݵ�� �����ϴܰ迡�� ������!
                Thread.sleep(1000);
                System.out.println(i);
            } catch(InterruptedException ex) { 
                ex.printStackTrace();
            }
        }
    }

}
