
package ex1;

import java.util.Scanner;

public class Ex6_Operator {
    public static void main(String[] args) {
            //클래스를 사용하기 위해서는 ctrl + space
    Scanner sc = new Scanner(System.in);
    //UI 글자를 입력하세요.
   System.out.print ("메세지 입력  :" );
    //사용자로부터 문자열을 입력 받은후 String msg에 저장하기 
   // sc.nextLine()란 메서드가 호출이 되면 String으로 반환되기 때문에
   //아래와 같이 같은 타입의 변수에 저장해서 사용될수 있따
  // 메서드 분석) 입력받은 문자열을 한줄 단위로 읽어서 String으로 반환한다.
    String msg = sc.nextLine();
    System.out.print("메시지 입력2 :");
    String msg2 = sc.nextLine();
    
    System.out.println("======================== ");
    System.out.print("입력값1 : "+msg);
    System.out.print("입력값2 : "+msg2);
        System.out.println("msg/msg2의 비교:" +(msg.equals(msg2)));
     String svc1 = new String("MyTest");
     String svc2 = "MyTest";
        System.out.println("svc1/svc2 비교 : " +(svc1.equals(svc2)));
     
      
    }
  
}
