package exam;

import java.util.Scanner;

/**
 * 1. �Է� , 2��� , 3 ���� : 1 ���� �ۼ��� ���� ���糯¥ 1. �Է� , 2��� , 3 ���� : 2 ���� ~~ ���� ��¥�� ���
 */
public class BoardMain {

    public static void main(String[] args) {
        Board_CallByReference vc = new Board_CallByReference();
        Scanner sr = new Scanner(System.in);

        board:while (true) {
            System.out.print("1,�Է� , 2 ��� , 3 ���� :");
            int menu = Integer.parseInt(sr.nextLine());
            switch (menu) {
                case 1:
                    BoardVO vo = new BoardVO();
                    System.out.print("���� :");
                    vo.setTitle(sr.nextLine());
                    System.out.print("���� :");
                    vo.setGender(sr.nextLine());
                    System.out.print("�ۼ��� :");
                    vo.setAuther(sr.nextLine());
                    System.out.print("���� :");
                    vo.setSentense(sr.nextLine());
                    System.out.print("���糯¥ :");
                    vo.setDate(sr.nextLine());
                    
               
                    if(vc.info(vo) == false) { 
                        System.out.println("�������� M,F,m,f�� �Է� �����մϴ�");
                    }

                    break;
                case 2:
                    System.out.print("���� :" + vc.getVo().getTitle());
                    System.out.print("���� :" + vc.getVo().getGender());
                    System.out.print("�ۼ���:" + vc.getVo().getAuther());
                    System.out.print("���� :" + vc.getVo().getSentense());
                    System.out.print("���糯¥ :" + vc.getVo().getDate());

                    break;
                case 3:
                    System.out.print("�����մϴ�.");
                    break board;

            }

        }

    }

}
