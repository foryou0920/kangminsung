
package ex1;

public class Ex2_Main {
    Ex2_Throws et;
    
    public Ex2_Main(String m) {
        et = new Ex2_Throws();
        try {
            et.setData(m);
        } catch (NumberFormatException e){
            System.out.println("당신은 문자를 입력했습니다 숫자를 입력하세요");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Ex2_Main ref = new Ex2_Main("m");
        
    }

}
