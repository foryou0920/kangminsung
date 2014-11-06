
package ex1;
//현재 클래스는 은행, 금융, 보험등 관련회사에서 사용하는 
//보안이 필요한 코드라면
//A팀과B팀이 현재코드에서 접근해서 작업을 할수 있는데 
//금액을 세팅할 팀이 A팀만 가능하게 하려면?

public class NewClass {
    
    
    public void insertPay(int p,String str){
        if(str.equals("dd")) { 
            System.out.println("당신은 접근 권한이 없습니다.");
            System.exit(0); // 시스템 종료
            
        }
        pay = p; // 호출시 받은 1000값을 멤버필드에 저장해놓겠다.
    }
    private int pay;
    public int getPay(){
        return pay;
    }

}
