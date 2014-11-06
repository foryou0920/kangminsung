package Test;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        TestControl con = new TestControl();
        TestVO vo = new TestVO();
        Scanner sc = new Scanner(System.in);

        Test:
        while (true) {
            System.out.print("입력1, 입력2, 입력3 :");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("이름 : ");
                    vo.setName(sc.nextLine());
                    System.out.print("나이 : ");
                    vo.setAge(sc.nextLine());
                    System.out.print("주소 : ");
                    vo.setAdd(sc.nextLine());
                    System.out.print("직업 : ");
                    vo.setJob(sc.nextLine());
                    System.out.print("신장 : ");
                    vo.setTall(Integer.parseInt(sc.nextLine()));
                    break;

                case 2:

                    System.out.print("이름 : ");
                    vo.setName(sc.nextLine());
                    System.out.print("나이 : ");
                    vo.setAge(sc.nextLine());
                    System.out.print("주소 : ");
                    vo.setAdd(sc.nextLine());
                    System.out.print("직업 : ");
                    vo.setJob(sc.nextLine());
                    System.out.print("신장 : ");
                    vo.setTall(Integer.parseInt(sc.nextLine()));
                    con.info(vo);

                    break;

                case 3:
                    System.out.println("종료합니다");
                    break Test;

            }

        }
    }
}
