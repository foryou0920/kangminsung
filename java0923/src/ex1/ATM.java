
package ex1;
// �Ӱ迵�� �߻����� : ��������� �𿩼� �������� �۾��ϴ� ����
// ���⼭ ���ü� ������ �߻��ɼ� �ִ�.
// synchronized�� �ɾ �ۼ� ��ock Pool�� �����尡 ���� 
// �ش����� �� ���� �ٸ� �������� ������ ���� �ʴ´�.
// �����带 �� �ٵη��� 

import java.util.logging.Level;
import java.util.logging.Logger;

public class ATM implements Runnable {
    private long despsiteMoney = 10000;

    public long getDespsiteMoney() {
        return despsiteMoney;
    }
    
    
    @Override
    public void run() {
        
        for(int i=0; i<10; i++) { 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            
            }
           withDraw(1000);
                if(getDespsiteMoney() <=0) { 
                break;
        } 
    }
    }

    private synchronized  void withDraw(int howMuch) {
         String tname = Thread.currentThread().getName();
        if(getDespsiteMoney() > 0) { 
            // 1000�� ���Ѵ�
            despsiteMoney -= howMuch;
            System.out.print("ThreadName :" + tname + ",");
            System.out.println("�ܾ� :" + getDespsiteMoney() + "");
        } else { 
            System.out.print("ThreadName :" +tname + ",");
            System.out.println("�ܾ��� �����մϴ�."+ getDespsiteMoney());
        }
       
    }
       public static void main(String[] args) {
        ATM atm = new ATM();
        Thread mother = new Thread(atm,"Mother");
        Thread son = new Thread(atm,"son");
       
        mother.start();
        son.start();
    }
    }


