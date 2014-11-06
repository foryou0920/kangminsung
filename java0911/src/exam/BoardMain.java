package exam;

import java.util.Scanner;

/**
 * 1. 입력 , 2출력 , 3 종료 : 1 제목 작성자 내용 현재날짜 1. 입력 , 2출력 , 3 종료 : 2 제목 ~~ 현재 날짜가 출력
 */
public class BoardMain {

    public static void main(String[] args) {
        Board_CallByReference vc = new Board_CallByReference();
        Scanner sr = new Scanner(System.in);

        board:while (true) {
            System.out.print("1,입력 , 2 출력 , 3 종료 :");
            int menu = Integer.parseInt(sr.nextLine());
            switch (menu) {
                case 1:
                    BoardVO vo = new BoardVO();
                    System.out.print("제목 :");
                    vo.setTitle(sr.nextLine());
                    System.out.print("성별 :");
                    vo.setGender(sr.nextLine());
                    System.out.print("작성자 :");
                    vo.setAuther(sr.nextLine());
                    System.out.print("내용 :");
                    vo.setSentense(sr.nextLine());
                    System.out.print("현재날짜 :");
                    vo.setDate(sr.nextLine());
                    
               
                    if(vc.info(vo) == false) { 
                        System.out.println("성별에는 M,F,m,f만 입력 가능합니다");
                    }

                    break;
                case 2:
                    System.out.print("제목 :" + vc.getVo().getTitle());
                    System.out.print("성별 :" + vc.getVo().getGender());
                    System.out.print("작성자:" + vc.getVo().getAuther());
                    System.out.print("내용 :" + vc.getVo().getSentense());
                    System.out.print("현재날짜 :" + vc.getVo().getDate());

                    break;
                case 3:
                    System.out.print("종료합니다.");
                    break board;

            }

        }

    }

}
