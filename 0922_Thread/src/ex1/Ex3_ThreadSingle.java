package ex1;
/**
 * @author kosta 
 * Document   : Ex3_ThreadSingle Created on : 2014. 9. 22, ���� 11:19:40
 */
// - �������� : start�� �ٸ�Ŭ������ �����ؾߵ� �ڿ��̱� ������ static���� 
// �����ϰ� Thread�� ����� ���� Ex3_MyThread���� �����Ѽ� 
// ����غ���.
public class Ex3_ThreadSingle {
    public static long start;
    public static void main(String[] args) {
        start = System.currentTimeMillis();
        // -------------------Thread�� ����
         Ex3_MyThread th = new Ex3_MyThread();
         th.start();
        // ----------------------------------------------
           for(int i =0; i<300; i++){
            System.out.print("X");
        }
        System.out.println("");
      
        System.out.println(System.currentTimeMillis() - start);
    }
}
