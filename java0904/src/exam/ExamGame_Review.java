package exam;

import java.util.Scanner;

public class ExamGame_Review {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int winCnt = 0, totalCnt = 0;
        String[] m = {" ", "Ȧ", "¦"};
        while (true) {
            System.out.println("Ȧ-1,¦-2,����-3:");
            int user = Integer.parseInt(sc.nextLine());
            int com = (int) (Math.random() * 2) + 1;
            String msg = "";
            if (user == 3) {
                System.out.println("���Ӽ�:" + totalCnt);
                System.out.println("�̱���� ��:" + winCnt);
                System.out.println("�·�:" + winn(winCnt, totalCnt) + "%");
                System.out.println("��ǰ :" + gift(90));
                System.out.println("����");
                break;
            } else {
                if (user == com) {
                    msg = "[�¸��ϼ̽��ϴ�]";
                    winCnt++;
                } else {
                    if (user != com) {
                        msg = "[���ϼ̽��ϴ�]";
                    }
                    totalCnt++;
                    System.out.println("���Ӽ�:" + totalCnt);
                    System.out.println("��ǻ��:" + com);
                    System.out.println("����:" + user);

                    System.out.println("-------------");
                    System.out.println("WIN :" + winCnt);
                    System.out.println(msg);
                    
                    
                
    

    public static int winn(int win,int total){
        int rate = (int) (((double) win / total) * 100);
        return rate;

    }

    public static String gift(int winNum) {
        String gMsg = "";
        if (winNum == 100) {
            gMsg = "�����մϴ� ��� ��÷�Դϴ�.";
        } else {
            if (winNum < 100 && winNum >= 90) {
                gMsg = "�����մϴ� �׷��� ��÷�Դϴ�.";
            } else if (winNum < 90 && winNum >= 80) {
                gMsg = "�����մϴ� �ҳ�Ÿ ��÷�Դϴ�";
            } else if (winNum < 80 && winNum >= 70) {
                gMsg = "�����մϴ� �ƹݶ� ��÷�Դϴ� ";
            } else if (winNum < 70 && winNum >= 60) {
                gMsg = "�����մϴ� �糪�� ��÷�Դϴ�.";
            } else {
                gMsg = "���Դϴ�.";
            }
          return gMsg;
        }
        return null;
       
    }
}
}


}
}
}




