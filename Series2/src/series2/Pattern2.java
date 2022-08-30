package series2;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int num;

        System.out.print("Enter You Line Number = ");
        num = boride.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int col = 1; col <= num; col++) {

                System.out.print(col);
            }

            System.out.print("\n");

        }
    }
}
