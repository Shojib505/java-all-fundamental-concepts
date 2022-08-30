package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner boride = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;

        System.out.print("Please Enter Your 5 Numbers = ");
        for (int i = 0; i < num.length; i++) {
            num[i] = boride.nextInt();
        }
        

        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];

        }

        double avg = sum / num.length;

        System.out.println("Length is = " + avg);
        System.out.println("The sum is = " + sum);

    }

}
