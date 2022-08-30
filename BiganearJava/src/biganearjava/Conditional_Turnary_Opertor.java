package biganearjava;

import java.util.Scanner;

public class Conditional_Turnary_Opertor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        
        System.out.print("Enter Number : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        large = (num1>num2)? num1: num2;
        System.out.println("Large Number Is " +large);
        
        
    }
}
