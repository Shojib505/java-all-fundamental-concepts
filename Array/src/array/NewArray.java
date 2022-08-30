package array;

import java.util.Scanner;

public class NewArray {

    public static void main(String[] args) {

        Scanner boride = new Scanner(System.in);
        double[] n = new double[5];
        double sumi = 0;

        System.out.print("Enter Your Five Numbers = ");
        for (int i = 0; i < n.length; i++) {
            n[i] = boride.nextDouble();
        }

        for (int i = 0; i < n.length; i++) {
            sumi = sumi + n[i];
        }

        double avg = sumi / n.length;
        System.out.println("Avarage is = " + avg);
        System.out.println("Sum is = " + sumi);

        double max = n[0];
        double min = n[0];

        for (int i = 1; i < 5; i++) {

            if (max < n[i]) {
                max = n[i];
            }
        }
        System.out.println("Maximum is = " + max);

        for (int i = 1; i < 5; i++) {

            if (min > n[i]) {
                min = n[i];
            }
        }
        System.out.println("Minimum is = " + min);

    }
}
