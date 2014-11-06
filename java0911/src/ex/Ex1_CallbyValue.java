
package ex;

public class Ex1_CallbyValue {
    public void test(int n) { 
        n = n+10;
        System.out.println("n1 :" +n);
    }
    public static void main(String[] args) {
        Ex1_CallbyValue a = new Ex1_CallbyValue();
        int n = 10; 
       a.test(n);
        System.out.println("n2 :" +n);
    }

}
