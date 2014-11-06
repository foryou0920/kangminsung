package inner;

public class LocalInner {
    private int a = 100; // 멤버변수

    public void myMethod(int n) {
        int b = 200; // 메서드 내의 지역변수
        final int c = 300;
        class Inner {

            public void getData() {
                //외부클래스의 자원 접근!
                System.out.println("int a : " + a);
                // 지역변수는 접근 못함(jdk8부터 지원, jdk5,6,7 안됨)
                // jdk5~7까지라면 반드시 지역변수를 상수로 변경해야 됨 
                System.out.println("local int b : " + n);
            }
        }
        Inner i = new Inner();
        i.getData();
    }

    public static void main(String[] args) {
        

    }
}
