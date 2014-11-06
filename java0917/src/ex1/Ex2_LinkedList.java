package ex1;

import java.util.LinkedList;


/*
 
jdk5부터 추가된 인터페이스인 Queue 인터페이스 구현한 클래스이다 
 Deque extends Queue 이므로 결국 Queue를 구현한 클래스임 
 큐구조(Fist-In-First-Out)
 선입선출 - 선입(offer(): 전달된 요소를 마지막 요소로 추가한다.)
 - 선출(poll() : 가장 첫번째 요소를 반환후 삭제한다.)
 add() : 마지막으로 전달된 요소를 추가한다.
 peek() : 가장 첫번째 요소를 반환한다.(삭제는 하지 않음)
 ArrayList는 순차적인 데이터를 읽어낼때 또는 순차적인 추가삭제
    
 */
public class Ex2_LinkedList {

    public static void main(String[] args) {
        String[] item = {"K7", "SM7", "뉴LF소나타"};
        LinkedList<String> q = new LinkedList<>();
        for (String n : item) {
            q.offer(n);
        }
        System.out.println("q의 크기: " + q.size());
        //향상된 for문으로 출력 - get(index) 출력
        for (String e : q) {
            System.out.println(e);

        }
        System.out.println("q의 크기2 :" + q.size());
        String data = "";
        //다읽고 지울때 까지
                while((data = q.poll()) != null) { 
                    System.out.println(data+"삭제!");
                }
                System.out.println("q의크기3 :"+q.size());
                
                    
                    
                }

    }


