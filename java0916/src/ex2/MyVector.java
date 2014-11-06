package ex2;

import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {
        //컬렉션은 자료구조이고 ,객체만저장이 됨!

        Vector v = new Vector();
        v.add(new String("Test"));
        v.add(10);
        v.add('A');
        v.add(true);
        v.add(3.14f);
        v.add(100L);
        System.out.println("벡터의 크기 : " + v.size());

        for (Object e : v) {
            if (e instanceof String) {
                System.out.println("String :" + v);
            } else if (e instanceof Integer) {
                System.out.println("integer :" + v);
            }
            //vector가 저장된 각 객체의 자료형과 동일한 이름으로 출력하기 

        }

    }
}
