
package ex;

public class Main {
    public static void main(String[] args) {
        PaintA a =  new PaintA();
        PaintB b =  new PaintB();
        Home home = new Home();
        
        home.setDoorColor("파란색");
        System.out.println("현재 색상 : " + home.getDoorColor());
        
        a.paintHome(home, "검은색");
        System.out.println(home.getDoorColor());
        b.paintHome(home, "빨간색");
        System.out.println(home.getDoorColor());
        
        
        
    }

}
