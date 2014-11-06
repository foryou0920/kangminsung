
package ex1;
// 임계영역 발생지점 : 쓰레드들이 모여서 공동으로 작업하는 공간
// 여기서 동시성 문제가 발생될수 있다.
// synchronized를 걸어서 작성 ㅣock Pool에 스레드가 들어가서 
// 해당일을 할 동안 다른 스레드의 간섭을 받지 않는다.
// 쓰레드를 잘 다두려면 

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
            // 1000씩 감한다
            despsiteMoney -= howMuch;
            System.out.print("ThreadName :" + tname + ",");
            System.out.println("잔액 :" + getDespsiteMoney() + "");
        } else { 
            System.out.print("ThreadName :" +tname + ",");
            System.out.println("잔액이 부족합니다."+ getDespsiteMoney());
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


