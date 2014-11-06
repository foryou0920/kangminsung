package ex1;

public class Ex1_Join {

    private static long startTime = 0;

    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); //t1�� �۾��� ���������� �ٸ� ������� ���

        Ex1_Thread2 t2 = new Ex1_Thread2();
        Thread tt2 = new Thread(t2);
        tt2.start();
        t1.join();
        // Runnable �������̽��� ������ Ŭ������ run�� �߻�޼���� �����ϱ⶧���� 
        // start()�޼ҵ带 �������� �ʴ´�.
        // run�� ȣ���Ѵٴ� ������ �����忡�� ���� ��Ű�ڴٴ°� �ƴ϶� 
        // �ᱹ �����带 ȣ���Ϸ��� start�� ȣ��
        // main���� run()�� ���� ȣ���ϴ� ��� main�� ���� ó���ϴ� ���̹Ƿ� 
        // �ٸ������尡 �ƴϴ�. 
        // ������ ������� >> ��� ,�������̽� 
        // �������̽� ������ �����带 �����ؼ� 
        // ������ ������ ���ڿ� runnable�� ������ Ŭ������ �ּҰ��� �Ѱ����  
        // start()�� ���� ������ �ִ�.

        System.out.println("�ɸ��ð�:" + (System.currentTimeMillis() - startTime));
    }

}
