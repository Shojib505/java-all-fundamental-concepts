package recursion;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        recursion re = new recursion();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int n1 = input.nextInt();
        int x = re.fact(n1);
        System.out.println("Factorial of " + n1 + " is : " + x);

    }
}
