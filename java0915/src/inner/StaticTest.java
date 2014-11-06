
package inner;

public class StaticTest {
    private static int a; 
    private int b;
public int increment() { 
        a++;
        return a;
       
        
    }
public int increment2() { 
        b++;
        return b;
       
        
    }
    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();
        System.out.println(t1.increment()); //1
        System.out.println(t1.increment2()); // 1
        System.out.println("----------------------");
        System.out.println(t2.increment()); //2
        System.out.println(t2.increment2());//1
        
    }

}
