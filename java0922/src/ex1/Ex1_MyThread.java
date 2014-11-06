
package ex1;

//�������� �����ֱ� 3���� 

import java.util.logging.Level;
import java.util.logging.Logger;

//new : �����尡 ������� ����(thread th = new thread())
//Runnable : ���డ���� ����(th.start() �޼��带 ȣ���� ����), �̶� 
//JVM�� �����ٷ��� �ش�ü���� �����ٷ����� �ڿ��� �Ҵ� �ޱ� ���ؼ� 
//��û�ѻ��� 
//Running : �������(run() �޼��带 ������ ����)

//thread�� �����ֱ�
//new - > Runnable -> Running -> Dead(����)_ Run�޼��尡 ����� ����
//Running -> -> Dead(����)
//�����尡 Ư���� ������ Running���¿��� blocked���·� �̵� 
//����ȭ���,I/O Request���� �����Ҷ� �̵��� 
//���� ������ ������ �ɶ�(�������� ������������) ��� ������

// Thread(Runnable target) 
// Allocate a new Thread object

public class Ex1_MyThread extends Thread {
    //�����忡�� ���� ���Ѻ���. 
    //run()�� , run2()ó�� throws�� ������ ���� ������? 
    //>>thread�� ��ӹ޾ұ� ������ run�� �������� ������ 
    //�����忡�� ���� ��Ű�� ���ؼ� �������ؼ� ����ϴ� �޼����̴�. 
    
    
    @Override
    public void run() {
        super.run(); 
        for(int i=0; i<=10; i++) { 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(i);
            
        }
    }
}