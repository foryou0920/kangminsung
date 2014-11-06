package ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3_Generic {
// jdk5부터 객체간의 캐스팅 문제를 해결하기 위해서 
// 전용컬렉션을 도입

    public static void main(String[] args) {
        // Vector 와 ArrayList 차이는 동기화 지원여부!
        // Vector가 동기화를 지원하는 기능이 있지만 다른부분으로 대체가능
        //
        ArrayList<String> str = new ArrayList<String>();
        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for (String e : str) {
            System.out.println(e);

        }
        System.out.println("iterator---------------------------");
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(Integer.parseInt("10"));
        //[과제] ArrayList를 사용하다 보니까 
        //회원정보를 저장하고 싶어요 근데 제네릭으로 표현되면 
        // 어떻게 각기 다른자료형들을 넣어서 회원정보에 저장할수 있을까요??
        //실행화면 
        //@ 1- 회원정보입력 , 2-회원리스트출력 , 3- 종료:1
        //  회원정보(int);
        //  회원이름(String);
        //  회원몸무게(Float);
        // 회원의 동의여부(boolean);
        // 회원의 이메일(string)
        // 회원의 나이(int);
        // 1- 회원정보입력 , 2-회원리스트출력 , 3- 종료: 2
        //  회원번호:1 
        //  이름: 이수연
        //  몸무게: 60.5kg
        //  동의여부: false
        //  이메일 : a@aa.com
        //  나이   : 18 (18세 미만일경우 "미성년자" , "성년")
        //[과제] - A조 강민성 : ArrayList를 응용한 회원관리
    }

}
