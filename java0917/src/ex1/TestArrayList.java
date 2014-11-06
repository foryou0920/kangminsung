package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numr1 = new ArrayList<>();
        LinkedList<Integer> numr2 = new LinkedList<>();
        add(numr1);
        add(numr2);
        System.out.println("소요시간");
        System.out.println("ArraList :" +getList(numr1));
        System.out.println("ArraList :" +getList(numr2));
    }

    public static void add(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i + " ");

        }
    }
    public static long getList(List list) { 
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++){ 
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    }
    
              
   
