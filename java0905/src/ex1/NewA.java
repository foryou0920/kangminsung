
package ex1;

public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertPay(1000, "aa");
        int pay = ref.getPay();
        int res = pay * 100;
        System.out.println("����� �޿��� :" +res+"�Դϴ�");
        
    }

}
