package exam;

import java.util.Scanner;

public class Exam2 {
    
    

    public static void main(String[] args) {
        //수를 입력하세요  9
        //범위를 입력하세요 3
        
        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력하세요:");
        int su = Integer.parseInt(sc.nextLine());

        System.out.print("범위를 입력하세요:");
        int range = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= su; i++) {

            if (i % range == 0 && i != 0) {

            System.out.println("   ");

            }
            System.out.print(i + "\t");
        }
    }
}
