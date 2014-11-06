package exam;

import java.util.Scanner;

public class Exam3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단 입력 :");
        int dan = Integer.parseInt(sc.nextLine());
        System.out.print("범위 입력 :");

        int range = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------");
        for (int k = dan - (range / 2); k <= dan + (range / 2); k++) {
            System.out.print("  " + k + "단\t");

        }
        System.out.println("");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= 9; i++) {
            for (int j = dan - (range / 2); j <= dan + (range / 2); j++) {

                if (j < 1) {
                    System.out.print("\t\t\t");

                } else {
                    System.out.print(j + "*" + i + "=" + (i * j) + "\t");
                }

            }
            System.out.println("");

        }
    }
}
