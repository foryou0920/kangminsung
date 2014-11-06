package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta 
 * Document   : Ex1_MyThread Created on : 2014. 9. 22, ���� 10:06:55
 */
//�������� �����ֱ� 3����
// New : �����尡 ������� ���� (Thread th = new Thread())
// Runnable : ���డ���� ����(th.start() �޼��带 ȣ���� ����), �̶�
// JVM�� �����ٷ��� �ش� �ü���� �����ٷ����� �ڿ��� �Ҵ� �ޱ� ���ؼ�
// ��û�� ����
// Running : ���� ���� (run() �޼��带 ������ ����)

// Thread�� �����ֱ� 
// 1. New -> Runnable -> Running -> Dead(����)
// 2. Running -> Blocked ->Dead(����- run�޼��尡 ����� ����)
// �����尡 Ư���� ������ Running ���¿��� Blocked ���·� �̵�
// ����ȭ����, I/O Request ���� �����Ҷ� �̵���
// ���� ������ ������ �ɶ�(��� ������ ������ ��) ���� ��� ������

// Thread�� �����ϴ� ��� ��, ���
public class Ex1_MyThread extends Thread{
// run()�� , run2() ó�� throws �� ������ ���� ������?
    // Thread�� ��ӹ޾ұ� ������ run�� �������� ������ 
    // �����忡�� ���� ��Ű�� ���ؼ� �������ؼ� ����ϴ� �޼����̴�.
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print(i);
        }
    }
 
}