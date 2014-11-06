package ex1;
/**
 * @author kosta 
 * Document   : NewClass1 Created on : 2014. 9. 15, ¿ÀÈÄ 6:34:52
 */
public class NewClass1 {
    static int a;
    int b;
    public NewClass1(int b) {
        this.b = b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b =30;
        NewClass1 test = new NewClass1(30);
        NewClass1 test2 = test;
        test2.b =10;
        System.out.println(a + test.b + NewClass1.a);
    }
}
