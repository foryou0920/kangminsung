package ex3;
/**
 * @author kosta 
 * Document   : Temp1 Created on : 2014. 9. 15, 오후 7:47:53
 */
public class Temp11 {
    private String msg;
    private int age;
    private boolean  agree;
    public void info(String m,int a, boolean  ag){
        msg = m;
        if(a < 19){
            System.out.println("미성년자 접근금지");
            System.exit(0);
        }
        age =a ;
        agree = ag;
    }

    public String getMsg() {
        return msg;
    }

    public int getAge() {
        return age;
    }

    public boolean isAgree() {
        return agree;
    }
    
}
