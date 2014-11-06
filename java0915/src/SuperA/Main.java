
package SuperA;
/**
 *
 * @author kosta
 * Document : Main Created on : 2014. 9. 15 , 오전 10:21:28
 */
public class Main {
    public static void main(String[] args) {
        Super su = new Super() { 
            public void draw(String msg) { 
                System.out.println("헛 :" + msg);
            }
        };
        su.draw("test");
        
        //추상클래스는 new로 생성될수 없다.
        Super[] ar = new Super[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"사각형" , "육각형"};
        int i = 0; 
        for(Super e : ar) { 
            e.draw(msg[i]);
            i++;
        }
    }
                
}
