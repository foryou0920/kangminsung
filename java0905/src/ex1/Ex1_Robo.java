
package ex1;
/** 클래스를 설계하고 정의하는 방법
 * 접근제한자 : public,default
 * class명은 앞글자는 항상 대문자로 작성, 식별자 명명 
 * main메서드는 분리한다.
 * @author kosta
 */

public class Ex1_Robo {
    /**
     * power는 전원의 값을 기억하는 속성,true가 켜진상태/ false가 꺼진상태
     *  col은 색상을 나타내는 string문자열
     */
    boolean power;
    String col;
    
    /**
     * @param  num : 로봇의 상태값으로 0보다 큰수에 동작되도록 되어 있음 
     * @return boolean 값으로 당신이 받아서 알아서 제어하시오 
     * @param num
     * @return 
     */
    
public boolean move(int num){
    
    boolean res = false;
    if(num <= 0) { 
        System.out.println("로보가 멈춥니다");
    } else{
        System.out.println("로보가"+num+"의 속도로 움직입니다.");
        res = true;
    }
            return res;
 

    

    }

    boolean isPower() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   