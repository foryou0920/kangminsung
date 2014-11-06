package ex1;
/**
 * @author kosta 
 * Document   : Ex1_Join Created on : 2014. 9. 23, ���� 9:04:28
 */
// ���� �����尡 ������ ����ɶ� ���� �ٸ� �����尡 ��� �ϵ��� �����ϴ� 
// �޼���
public class Ex1_Join {
    private static long startTime;
    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); // t1�� �۾��� ������ ���� �ٸ� ������� ���
        Ex1_Thread2 t2 = new Ex1_Thread2();
        Thread tt2 = new Thread(t2);
        tt2.start();
        tt2.join();
        System.out.println("�ɸ��ð� :"+(System.currentTimeMillis() - startTime));
    }
}
