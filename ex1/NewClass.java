package ex1;
/**
 * @author kosta 
 * Document   : NewClass Created on : 2014. 9. 15, ���� 6:28:37
 */
public class NewClass {
    public static void main(String[] args) {
        int x = 5;
        boolean b1 =true;
        boolean b2 = false;
        if((x == 4) && !b2) System.out.println("1");
        System.out.println("2");
        if((b2 = true) && b1) System.out.println("3");
    }
}
