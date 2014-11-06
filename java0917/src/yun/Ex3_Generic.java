package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author kosta
 * Document : Ex3_Generic Created on : 2014. 9. 16, 오후 3:31:48
 */

// jdk5부터 객체 간의 캐스팅 문제를 해결하기 위해서 전용컬렉션을 도입
public class Ex3_Generic 
{
    private void checkAge(int age) throws WrongAgeException{
        if(age<0){
            throw new WrongAgeException("잘못된 나이입니다.");
        }
    }
    
    public static void main(String[] args) {
        // vector와 arraylist는 비슷.. 차이는 동기화 지원 여부
        // vector가 동기화를 지원이 있지만 다른 부분으로 대체가 가능(스레드와 관련있다) // 동기화 여부를 계속 검사함.. 동기화 지원 안 하면 쓸모 없음
        // 동기화란..? 자원의 점유와 대기..
        // Generic - String만 담을 수 있는 ArrayList
        ArrayList<String> str = new ArrayList<>();  // 이 형식이 jdk7부터 변경된 요소. 6 이하에서는 오류        
        str.add("ok");
        str.add(String.valueOf(10));    // 그냥 10만 써두면 vector와는 다르게 오류가 발생한다
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for(String e:str){
            System.out.println(e);
        }
        System.out.println("-----------Iterator---------");
        // Iterator it = str.iterator();   // 이건 jdk 이전으로 돌아가자는 무식한 코딩임
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(Integer.parseInt("20"));
        Iterator<Integer> it2 = num.iterator();
        while(it2.hasNext()){
            Integer i = it2.next();
            System.out.println(i);
        }
        
        // 과제] ArrayList를 사용하다 보니까 거기에 회원정보를 저장하고 싶다.
        // 근데 제네릭으로 표현되면 어떻게 각기 다른 자료형을 넣어서 회원정보에 저장할 수 있을까?
        /*
                1-회원정보 입력, 2-회원리스트 출력, 3-종료
                회원번호 int
                회원이름 String
                몸무게 float
                동의여부 boolean
                이메일 String
        
                이렇게 회원을 5명 정도 추가하고..
                회원 나이 출력 시 미성년자 혹은 성년인지 출력 --- [미성년자] / 성년 ---- 이렇게
        
        [과제] - A조 김윤영 : ArrayList를 응용한 회원관리
        */
        
        int idx;
        Scanner sc = new Scanner(System.in);
        ArrayList<Info> ar = new ArrayList<>();
        Ex3_Generic g = new Ex3_Generic();
        
        out: while(true){
            System.out.println("1.회원 정보 입력  2.회원 리스트 출력  3.종료");
            System.out.print("선택: ");
            idx = Integer.parseInt(sc.nextLine());
            switch(idx){
                case 1:
                    try {
                        Info temp = new Info();
                        System.out.print("번호: ");
                        temp.setNum(Integer.parseInt(sc.nextLine()));
                        System.out.print("이름: ");
                        temp.setName(sc.nextLine());
                        System.out.print("몸무게: ");
                        temp.setWeight(Integer.parseInt(sc.nextLine()));
                        System.out.print("동의여부: ");
                        temp.setAgree(Boolean.getBoolean(sc.nextLine()));
                        System.out.print("이메일: ");
                        temp.setMail(sc.nextLine());
                        System.out.print("나이: ");
                        int age = Integer.parseInt(sc.nextLine());
                        temp.setAge(age);
                        g.checkAge(age);
                        ar.add(temp);
                        System.out.println("입력 성공");
                    } catch (NumberFormatException e) {
                        System.out.println("각 자료형에 맞는 정보를 입력해주세요...");
                    } catch (WrongAgeException e) {
                        System.out.println(e.getMessage());
                    } finally{
                        System.out.println("-----------------------");
                    }
                    break;
                case 2:
                    if(ar.isEmpty()){   
                        System.out.println("회원이 없습니다.");
                        break;
                    }
                    for(Info e:ar){
                        System.out.println("번호: "+e.getNum());
                        System.out.println("이름: "+e.getName());
                        System.out.println("몸무게: "+e.getWeight());
                        System.out.println("동의여부: "+e.isAgree());
                        System.out.println("이메일: "+e.getMail());
                        System.out.println("나이: "+e.getAge());
                        System.out.println("-----------------------");
                    }
//                    Iterator<Info> temp = ar.iterator();
//                    while(temp.hasNext()){
//                        
//                    }
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    break out;
                default:
                    System.out.println("알맞은 메뉴를 선택해주세요.");
            }
        }
    }
}
