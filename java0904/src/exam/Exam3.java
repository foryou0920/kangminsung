package exam;

import java.util.Scanner;

public class Exam3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("�� �Է� :");
        int dan = Integer.parseInt(sc.nextLine());
        System.out.print("���� �Է� :");

        int range = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------");
        for (int k = dan - (range / 2); k <= dan + (range / 2); k++) {
            System.out.print("  " + k + "��\t");

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
