package exam;

import java.util.Scanner;

public class ExamGame_Review {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int winCnt = 0, totalCnt = 0;
        String[] m = {" ", "홀", "짝"};
        while (true) {
            System.out.println("홀-1,짝-2,종료-3:");
            int user = Integer.parseInt(sc.nextLine());
            int com = (int) (Math.random() * 2) + 1;
            String msg = "";
            if (user == 3) {
                System.out.println("게임수:" + totalCnt);
                System.out.println("이긴게임 수:" + winCnt);
                System.out.println("승률:" + winn(winCnt, totalCnt) + "%");
                System.out.println("상품 :" + gift(90));
                System.out.println("종료");
                break;
            } else {
                if (user == com) {
                    msg = "[승리하셨습니다]";
                    winCnt++;
                } else {
                    if (user != com) {
                        msg = "[패하셨습니다]";
                    }
                    totalCnt++;
                    System.out.println("게임수:" + totalCnt);
                    System.out.println("컴퓨터:" + com);
                    System.out.println("유저:" + user);

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
            gMsg = "축하합니다 페라리 당첨입니다.";
        } else {
            if (winNum < 100 && winNum >= 90) {
                gMsg = "축하합니다 그랜저 당첨입니다.";
            } else if (winNum < 90 && winNum >= 80) {
                gMsg = "축하합니다 소나타 당첨입니다";
            } else if (winNum < 80 && winNum >= 70) {
                gMsg = "축하합니다 아반떼 당첨입니다 ";
            } else if (winNum < 70 && winNum >= 60) {
                gMsg = "축하합니다 당나귀 당첨입니다.";
            } else {
                gMsg = "꽝입니다.";
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




