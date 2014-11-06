package test;

import java.util.ArrayList;
import java.util.Scanner;

public class User_Main {

    public static void main(String[] args) {
        ArrayList<User_Vo> ar = new ArrayList<User_Vo>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1- 회원정보입력 , 2-회원리스트출력 , 3- 종료:");
            int num = Integer.parseInt(sc.nextLine());

            if (num == 1) {
                System.out.println("가입을 위한 회원정보를 입력해주세요");
                System.out.println("---------------------------------");
                User_Vo vo = new User_Vo();
                System.out.print("회원번호 :");
                vo.setNum(Integer.parseInt(sc.nextLine()));
                System.out.print("이    름 :");
                vo.setName(sc.nextLine());
                System.out.print("나    이 :");
                vo.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("몸 무 게 :");
                vo.setWeight(Float.parseFloat(sc.nextLine()));
                System.out.print("메일주소 :");
                vo.setEmail(sc.nextLine());
                System.out.print("정보동의 :");
                vo.setAgree(Boolean.parseBoolean(sc.nextLine()));
                ar.add(vo);

            } else if (num == 2) {
                System.out.println("---------------------------------");
                for (User_Vo a : ar) {
                    System.out.println("회원번호 :" + a.getNum());
                    System.out.println("이    름 :" + a.getName());
                    System.out.println("나    이 :" + a.getAge());
                    System.out.println("몸 무 게 :" + a.getWeight());
                    System.out.println("메일주소 :" + a.getEmail());
                    System.out.println("정보동의 :" + a.isAgree());

                    if (a.getAge() < 18) {
                        System.out.println("미성년자로 가입이 어렵습니다");
                    } else {
                        System.out.println("축하합니다 가입이 완료되었습니다.");
                    }
                }

            } else if (num == 3) {
                System.out.println("시스템을 종료합니다");
                break;

            } else {
                System.out.println("잘못입력하였습니다");
            }
        }
    }
}
