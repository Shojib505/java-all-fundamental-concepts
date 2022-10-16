package series2;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner boride = new Scanner(System.in);
        int num, temp, r, sum = 0;

        System.out.print("Enter Your Number = ");
        num = boride.nextInt();

        temp = num;

        while (temp != 0) {

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if (sum == num) {
            System.out.println("Number Is Palindrom");
        } else {
            System.out.println("Number Is Not Palindrom");
        }

    }

}
