
package ex1;
// ��������
//start�� �ٸ�Ŭ������ �����ؾߵ� �ڿ��̱� ������ static���� �����ϰ�  
//thread�� ����� ���� Ex3_MyThread���� �����Ѽ� ����غ���.
public class Ex3_ThreadSingle {
    public static long start;
    public static void main(String[] args) {
        
    start = System.currentTimeMillis();
       //--------------------thread�� ����
        Ex3_MyThread th = new Ex3_MyThread();
        th.start();
      
        //----------------------------------------------------
        for(int i=0; i<300; i++) { 
            System.out.print("X");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis()-start);
    }

}
