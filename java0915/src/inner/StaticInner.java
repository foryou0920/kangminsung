package inner;

public class StaticInner {

    int a = 10;
    private int b = 100;
    static int c = 200;

    static class Inner {
         // 어쩔수 없이 " 내부클래스안에서 static자원을" 사용하게 된다면 
        //  이때 내부클래스는 static 내부클래스 정의 되어야 한다.

        static int d = 1000;

        public void printData() {
//          System.out.println("int a :" +a);
//          System.out.println("int b :" +b);
              System.out.println("int c:" + c);
        }
    }

    public static void main(String[] args) {
//           StaticInner inn = new StaticInner();
//           StaticInner inn2 = new StaticInner();
//          System.out.println(inn.a);
//          System.out.println(inn2.b);

        StaticInner.Inner inner = new StaticInner.Inner();
        inner.printData();

    }

}
