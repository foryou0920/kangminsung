package ex1;

import java.util.HashSet;
import java.util.Iterator;

public class Ex1_HashSet {

    public static void main(String[] args) {
        String[] str = {"java", "beans", "java", "json"};

        HashSet<String> hs1 = new HashSet<>();
        System.out.println("크기 :" + hs1.size());
        for (String n : hs1) {
            hs1.add(n);
        }
        System.out.println("크기 : " + hs1.size() + ",배열의 크기 : str.length");
        for (String e : hs1) {
            System.out.println(e);
        }
        hs1.removeAll(hs1);
        System.out.println("--------------------------------------");
        System.out.println("크기 : " + hs1.size());
        HashSet<Integer> hs2 = new HashSet<>();
        int[] numr = {5, 3, 2, 1, 8, 9, 7, 5,};
        for (int e : numr) {
            System.out.println("크기 :" + hs2.size());
            Iterator<Integer> it = hs2.iterator();
            while (it.hasNext()) {
                Integer integer = it.next();
                System.out.println(integer);

            }

        }

    }
}
