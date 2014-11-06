
package ex3;

import java.util.Scanner;

public class Ex2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호입력 :");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("이름입력 :");
        String name = sc.nextLine();
        System.out.println("나이입력 :");
        String age = sc.nextLine();
        System.out.println("성별입력 :");
        String gender = sc.nextLine();
        System.out.println("전화번호 입력 :");
        String tel = sc.nextLine();
        
        Ex2_CallByReference ref = new Ex2_CallByReference();
        ref.info(num, name, age, gender, tel);
        //사용클래스 생성
        
        System.out.println("입력하신 정보 :");
        System.out.println("번호 :" +ref.getNum());
        System.out.println("이름 :" +ref.getName());
        System.out.println("나이 :" +ref.getAge());
        System.out.println("성별 :" +ref.getGender());
        System.out.println("전화번호 :"+ref.getTel());
        
    }

}
