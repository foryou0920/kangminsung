
package ex;

public class Main {
    public static void main(String[] args) {
        PaintA a =  new PaintA();
        PaintB b =  new PaintB();
        Home home = new Home();
        
        home.setDoorColor("�Ķ���");
        System.out.println("���� ���� : " + home.getDoorColor());
        
        a.paintHome(home, "������");
        System.out.println(home.getDoorColor());
        b.paintHome(home, "������");
        System.out.println(home.getDoorColor());
        
        
        
    }

}
